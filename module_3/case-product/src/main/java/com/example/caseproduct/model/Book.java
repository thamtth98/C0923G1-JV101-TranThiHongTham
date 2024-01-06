package com.example.caseproduct.model;

public class Book {
    private Integer idSach;
    private String tenSach;
    private Double gia;
    private Integer soLuong;
    private String hinhAnh;
    private String moTa;
    private Integer idTheLoai;
    private Integer idTacGia;
    private String tenTacGia;
    private String tenTheLoai;


    public Book(Integer idSach, String tenSach, Double gia, Integer soLuong, String hinhAnh, String moTa, Integer idTheLoai, Integer idTacGia) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
        this.idTheLoai = idTheLoai;
        this.idTacGia = idTacGia;
    }

    public Book(Integer idSach, String tenSach, Double gia, Integer soLuong, String hinhAnh, String moTa, Integer idTheLoai, Integer idTacGia, String tenTacGia, String tenTheLoai) {
        this.idSach = idSach;
        this.tenSach = tenSach;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
        this.idTheLoai = idTheLoai;
        this.idTacGia = idTacGia;
        this.tenTacGia = tenTacGia;
        this.tenTheLoai = tenTheLoai;
    }

    public Book() {
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Integer getIdSach() {
        return idSach;
    }

    public void setIdSach(Integer idSach) {
        this.idSach = idSach;
    }


    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getIdTheLoai() {
        return idTheLoai;
    }

    public void setIdTheLoai(Integer idTheLoai) {
        this.idTheLoai = idTheLoai;
    }

    public Integer getIdTacGia() {
        return idTacGia;
    }

    public void setIdTacGia(Integer idTacGia) {
        this.idTacGia = idTacGia;
    }
}
