package com.example.usermanager.controller;

import com.example.usermanager.model.Users;
import com.example.usermanager.repository.DBConnection;
import com.example.usermanager.service.IUserService;
import com.example.usermanager.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private IUserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                RequestDispatcher dispatcher = req.getRequestDispatcher("/user_manage/create.jsp");
                dispatcher.forward(req, resp);
                break;
            case "edit":
                showFormEdit(req, resp);
                break;
            case "delete":
                deleteUser(req,resp);
                break;
            case "searchUser":
                searchUser(req,resp);
                break;
            case "sort":
                sortByName(req,resp);
                break;
            default:
                getUserList(req, resp);
        }
    }

    private void sortByName(HttpServletRequest req, HttpServletResponse resp) {
        String sortOption = req.getParameter("sortOption");
        List<Users> usersList = userService.sortByName(sortOption);
        req.setAttribute("userList", usersList);
        try {
            req.getRequestDispatcher("user_manage/list.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void searchUser(HttpServletRequest req, HttpServletResponse resp) {
        String country = req.getParameter("country");
        List<Users> usersList = userService.searchUser(country);
        req.setAttribute("userList", usersList);
        try {
            req.getRequestDispatcher("/user_manage/list.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        userService.deleteUser(id);
        try {
            resp.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher;
        int id = Integer.parseInt(req.getParameter("id"));
        Users user = userService.findById(id);
        if (user != null) {
            req.setAttribute("user", user);
            req.setAttribute("id", id);
            dispatcher = req.getRequestDispatcher("/user_manage/edit.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void getUserList(HttpServletRequest req, HttpServletResponse resp) {
        List<Users> usersList = userService.showList();
        try {
            req.setAttribute("userList", usersList);
            req.getRequestDispatcher("/user_manage/list.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(req,resp);
                break;
            case "editUser":
                editUser(req,resp);
                break;
            default:
                getUserList(req, resp);
        }
    }

    private void editUser(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        Users users = new Users(id,name, email, country);
        userService.editUser(users);
        try {
            resp.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createUser(HttpServletRequest req, HttpServletResponse resp) {
        String nameUser = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        Users users = new Users(nameUser, email, country);
        userService.createUser(users);
        try {
            resp.sendRedirect("/user");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
