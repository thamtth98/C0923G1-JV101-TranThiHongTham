package com.example.chuonglon.model;

public class Chuong {
    private Integer idChuong;
    private String loaiChuong;
    private Integer sucChua;

    public Chuong(Integer idChuong, String loaiChuong, Integer sucChua) {
        this.idChuong = idChuong;
        this.loaiChuong = loaiChuong;
        this.sucChua = sucChua;
    }

    public Chuong() {
    }

    public Integer getIdChuong() {
        return idChuong;
    }

    public void setIdChuong(Integer idChuong) {
        this.idChuong = idChuong;
    }

    public String getLoaiChuong() {
        return loaiChuong;
    }

    public void setLoaiChuong(String loaiChuong) {
        this.loaiChuong = loaiChuong;
    }

    public Integer getSucChua() {
        return sucChua;
    }

    public void setSucChua(Integer sucChua) {
        this.sucChua = sucChua;
    }
}
