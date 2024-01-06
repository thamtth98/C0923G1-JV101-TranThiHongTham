package com.example.caseproduct.controller;

import com.example.caseproduct.model.Book;
import com.example.caseproduct.service.BookService;
import com.example.caseproduct.service.IBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BookServlet", urlPatterns = "/book")
public class BookServlet extends HttpServlet {
    private IBookService bookService = new BookService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "detailBook":
                detailBook(req,resp);
                break;
            default:
                showBookList(req, resp);
                break;
        }

    }



    private void detailBook(HttpServletRequest req, HttpServletResponse resp) {
        int idBook = Integer.parseInt(req.getParameter("idSach"));
        Book book = bookService.findById(idBook);
        req.setAttribute("book",book);
        try {
            req.getRequestDispatcher("/product/showDetailProduct.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }

    private void showBookList(HttpServletRequest req, HttpServletResponse resp) {
        String typeBook = req.getParameter("typeBook");
        if (typeBook == null) {
            typeBook = "";
        }
        List<Book> bookList = bookService.showBookList(typeBook);
        req.setAttribute("bookList", bookList);
        String resultType = null;
        switch (typeBook) {
            case "1":
                resultType = "Trinh thám";
                break;
            case "2":
                resultType = "Tiểu thuyết";
                break;
            case "3":
                resultType = "Self-help";
                break;
        }
        req.setAttribute("resultType", resultType);
        try {
            req.getRequestDispatcher("/product/showProduct.jsp").forward(req, resp);
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
            case "searchByName":
                searchByName(req,resp);
                break;
            default:
                showBookList(req, resp);
                break;
        }
    }
    private void searchByName(HttpServletRequest req, HttpServletResponse resp) {
        String nameBook = req.getParameter("search-name");
        List<Book> bookListByName = bookService.findByName(nameBook);
        req.setAttribute("bookList", bookListByName);
        try {
            req.getRequestDispatcher("/product/showProduct.jsp").forward(req, resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }

    }
}
