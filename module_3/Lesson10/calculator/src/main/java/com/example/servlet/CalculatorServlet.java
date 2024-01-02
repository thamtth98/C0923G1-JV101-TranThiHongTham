package com.example.servlet;

import com.example.calculator.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/calculator.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/calculator.jsp");
        double firstNumber = Double.parseDouble(req.getParameter("first-number"));
        double secondNumber = Double.parseDouble(req.getParameter("second-number"));
        char operator = req.getParameter("operator").charAt(0);
        double result = 0;
        try{
            result = Calculator.calculate(firstNumber, secondNumber, operator);
        }catch (Exception e){
            req.setAttribute("error","Invalid number");
        }
        req.setAttribute("result",result);
        requestDispatcher.forward(req,resp);
    }
}
