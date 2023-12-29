package com.example.calculator;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator", value = "/display-discount")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float listPrice = Float.parseFloat(req.getParameter("price"));
        float percent = Float.parseFloat(req.getParameter("percent"));
        double discount = (listPrice * percent * 0.01);
        double totalPrice =  (listPrice - Math.ceil(discount *100.0)/100.0);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.print("<table> \n" +
                "       <tr>\n" +
                "            <td>Discount Amount:</td>\n" +
                "            <td>"+discount+"</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td>Discount Price: </td>\n" +
                "            <td>"+totalPrice+"</td>\n" +
                "        </tr>\n" +
                "</table>");
    }
}
