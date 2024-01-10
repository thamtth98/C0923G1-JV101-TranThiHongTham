package com.example.usermanage.controller;

import com.example.usermanage.model.User;
import com.example.usermanage.service.IUserService;
import com.example.usermanage.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
                showFormCreate(req, resp);
                break;
            case "edit":
                showFormEdit(req, resp);
                break;
            case "delete":
                deleteUser(req,resp);
                break;
            case "search":
                searchUser(req,resp);
                break;
            case "sort":
                sortUser(req,resp);
                break;
            default:
                showListUser(req, resp);
                break;
        }
    }

    private void sortUser(HttpServletRequest req, HttpServletResponse resp) {
        String sortOption = req.getParameter("sortOption");
        List<User> userList = userService.sortUser(sortOption);
        req.setAttribute("userList",userList);
        try {
            req.getRequestDispatcher("/user/list.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }

    private void searchUser(HttpServletRequest req, HttpServletResponse resp) {
        String search = req.getParameter("search");
        List<User> userList = userService.searchUser(search);
        req.setAttribute("userList",userList);
        try {
            req.getRequestDispatcher("/user/list.jsp").forward(req,resp);
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
        int id = Integer.parseInt(req.getParameter("id"));
        User user = userService.findById(id);
        req.setAttribute("user", user);
        try {
            req.getRequestDispatcher("/user/edit.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("/user/create.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }

    private void showListUser(HttpServletRequest req, HttpServletResponse resp) {
        List<User> userList = userService.showListUser();
        req.setAttribute("userList", userList);
        try {
            req.getRequestDispatcher("/user/list.jsp").forward(req, resp);
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
                createUser(req, resp);
                break;
            case "edit":
                editUser(req, resp);
                break;
            default:
                showListUser(req, resp);
                break;
        }
    }

    private void editUser(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = new User(id,name, email, country);
        userService.editUser(user);
        try {
            resp.sendRedirect("/user");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    private void createUser(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = new User(name, email, country);
        userService.createUser(user);

        try {
            resp.sendRedirect("/user");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
