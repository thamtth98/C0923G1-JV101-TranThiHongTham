package com.example.listcustomer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListCustomer", value = "")
public class ListCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Hoa Anh Đào", "12/12/1990", "Hà Nội","https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2020/10/9/843491/Lisa-Blackpink-2.jpg"));
        customerList.add(new Customer("Nguyễn Văn Cam", "12/10/1999", "Đà Nẵng", "https://nld.mediacdn.vn/291774122806476800/2023/7/28/363355580666733495478560390344741297529282n-16905469307022072174299.jpg"));
        customerList.add(new Customer("Nguyễn Văn Táo", "10/12/1999", "Đà Nẵng", "https://img.meta.com.vn/Data/image/2021/12/07/nhan-vat-trong-harry-potter-17.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi", "19/09/1987", "Huế","https://i.pinimg.com/originals/12/e7/bc/12e7bc2b2152882ecd15c166600e0c2c.jpg"));
        req.setAttribute("customerList", customerList);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
