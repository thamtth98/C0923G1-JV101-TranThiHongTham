package com.example.product.cotrollers;

import com.example.product.models.Product;
import com.example.product.services.IProductService;
import com.example.product.services.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "products", value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    req.getRequestDispatcher("product/create.jsp").forward(req, resp);
                } catch (ServletException e) {
                    System.out.println("ServletException");
                } catch (IOException e) {
                    System.out.println("IOException");
                }
                break;
            case "edit":
                RequestDispatcher dispatcher = req.getRequestDispatcher("product/edit.jsp");
                int id = Integer.parseInt(req.getParameter("id"));
                Product product = iProductService.findById(id);
                req.setAttribute("productEdit", product);
                try {
                    dispatcher.forward(req, resp);
                } catch (ServletException e) {
                    System.out.println("ServletException");
                } catch (IOException e) {
                    System.out.println("IOException");
                }
                break;
            case "delete":
                dispatcher = req.getRequestDispatcher("product/delete.jsp");
                id = Integer.parseInt(req.getParameter("id"));
                product = iProductService.findById(id);
                req.setAttribute("productDel", product);
                try {
                    dispatcher.forward(req, resp);
                } catch (ServletException e) {
                    System.out.println("ServletException");
                } catch (IOException e) {
                    System.out.println("IOException");
                }
                break;
            case "view":
                viewDetail(req, resp);
                break;
            case "findByName":
                dispatcher = req.getRequestDispatcher("product/findByName.jsp");
                String nameSearch = req.getParameter("nameSearch");
                List<Product> productListByName = iProductService.findByName(nameSearch);
                if(productListByName !=null){
                    req.setAttribute("productListByName", productListByName);
                }else {
                    System.out.println("not found");
                }
                dispatcher.forward(req, resp);
                break;
            default:
                showProductList(req, resp);
                break;
        }
    }


    private void viewDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("product/viewDetail.jsp");
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = iProductService.findById(id);
        req.setAttribute("product", product);
        dispatcher.forward(req, resp);
    }

    private void showProductList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = iProductService.showProductList();
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("product/showList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(req, resp);
                break;
            case "edit":
                editProduct(req, resp);
                break;
            case "delete":
                deleteProduct(req, resp);
                break;
            default:
                showProductList(req, resp);
                break;
        }
    }

    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = iProductService.findById(id);
        iProductService.deleteProduct(product);
        resp.sendRedirect("/product");
    }

    private void editProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        Product product = new Product(id, name, price);
        iProductService.edit(id, product);
        try {
            resp.sendRedirect("/product");
        } catch (IOException e) {
            System.out.println("RuntimeException");
        }
    }

    private void createProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        Product product = new Product(id, name, price);
        iProductService.createProduct(product);
        try {
            resp.sendRedirect("/product");
        } catch (IOException e) {
            System.out.println("RuntimeException");
        }
    }
}