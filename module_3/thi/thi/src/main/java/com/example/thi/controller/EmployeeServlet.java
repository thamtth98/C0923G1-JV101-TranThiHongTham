package com.example.thi.controller;

import com.example.thi.model.Employee;
import com.example.thi.service.EmployeeService;
import com.example.thi.service.IEmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService = new EmployeeService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showFormCreate(req,resp);
                break;
            case "delete":
                deleteEmpl(req,resp);
                break;
            case "search":
                searchEmp(req,resp);
                break;
            default:
                showListEmployee(req,resp);
                break;
        }
    }

    private void searchEmp(HttpServletRequest req, HttpServletResponse resp) {
        String search = req.getParameter("search");
        List<Employee> employeeList = employeeService.searchEmp(search);
        req.setAttribute("employeeList",employeeList);
        try {
            req.getRequestDispatcher("/employee/list.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmpl(HttpServletRequest req, HttpServletResponse resp) {
       int idEmpl= Integer.parseInt(req.getParameter("idEmpl"));
       employeeService.deleteEmpl(idEmpl);
        try {
            resp.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showFormCreate(HttpServletRequest req, HttpServletResponse resp) {
        List<Employee> employeeList = employeeService.showListEmployee();
        req.setAttribute("employeeList",employeeList);
        try {
            req.getRequestDispatcher("/employee/create.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showListEmployee(HttpServletRequest req, HttpServletResponse resp) {
        List<Employee> employeeList = employeeService.showListEmployee();
        req.setAttribute("employeeList",employeeList);
        try {
            req.getRequestDispatcher("/employee/list.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createEmpl(req,resp);
                break;
            default:
                showListEmployee(req,resp);
                break;
        }
    }

    private void createEmpl(HttpServletRequest req, HttpServletResponse resp) {
//        int idEmployee = Integer.parseInt(req.getParameter("idEmployee"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String phoneNumber =req.getParameter("phoneNumber");
        int salary = Integer.parseInt(req.getParameter("salary"));
        Employee employee = new Employee(name,email,address,phoneNumber,salary);
        employeeService.createEmpl(employee);
        try {
            resp.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
