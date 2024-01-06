package com.example.chuonglon.controller;


import com.example.chuonglon.model.Lon;
import com.example.chuonglon.service.ILonService;
import com.example.chuonglon.service.impl.LonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LonServlet", value = "/lon")
public class LonServlet extends HttpServlet {
    private ILonService lonService = new LonService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action ="";
        }

        switch (action){
            case "create":
                showFormCreate(req,resp);
                break;
            case "edit":
                showFormEdit(req,resp);
                break;
            case "delete":
                deleteLon(req,resp);
                break;
            default:
                showListLon(req,resp);
        }
    }

    private void deleteLon(HttpServletRequest req, HttpServletResponse resp) {
        int idLon = Integer.parseInt(req.getParameter("id"));
        lonService.deleteLon(idLon);
        try {
            resp.sendRedirect("/lon");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest req, HttpServletResponse resp) {
        int idLon = Integer.parseInt(req.getParameter("id"));
        Lon lon = lonService.findByID(idLon);
        req.setAttribute("lon",lon);
        try {
            req.getRequestDispatcher("/chuong-lon/edit.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("/chuong-lon/createList.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }


    private void showListLon(HttpServletRequest req, HttpServletResponse resp) {
        List<Lon> lonList = lonService.showListLon();
        req.setAttribute("lonList",lonList);
        try {
            req.getRequestDispatcher("/chuong-lon/list.jsp").forward(req,resp);
        } catch (ServletException | IOException e) {
            e.getStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action ="";
        }

        switch (action){
            case "create":
                createLon(req,resp);
                break;
            case "edit":
                editLon(req,resp);
            default:
                showListLon(req,resp);
        }
    }

    private void editLon(HttpServletRequest req, HttpServletResponse resp) {
        int idLon = Integer.parseInt(req.getParameter("idLon"));
        String tenLon = req.getParameter("tenLon");
        Integer trongLuong = Integer.parseInt(req.getParameter("trongLuong"));
        Integer tuoi = Integer.parseInt(req.getParameter("tuoi"));
        String gioiTinh = req.getParameter("gioiTinh");
        String chuongHienTai = req.getParameter("chuongHienTai");
        Lon lon = new Lon(idLon,tenLon,trongLuong,tuoi,gioiTinh,chuongHienTai);
        lonService.editLon(lon);
    }

    private void createLon(HttpServletRequest req, HttpServletResponse resp) {
        String tenLon = req.getParameter("name");
        Integer trongLuong = Integer.parseInt(req.getParameter("weight"));
        Integer tuoi = Integer.parseInt(req.getParameter("age"));
        String gioiTinh = req.getParameter("gender");
        String chuongHienTai = req.getParameter("chuong");
        Lon lon = new Lon(tenLon,trongLuong,tuoi,gioiTinh,chuongHienTai);
        lonService.createLon(lon);
        try {
            resp.sendRedirect("/lon");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
