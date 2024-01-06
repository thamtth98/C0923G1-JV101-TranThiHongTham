package com.example.chuonglon.model;

public class Lon {
    private Integer idLon;
    private String tenLon;
    private Integer trongLuong;
    private Integer tuoi;
    private String gioiTinh;
    private String chuongHienTai;

    public Lon(Integer idLon, String tenLon, Integer trongLuong, Integer tuoi, String gioiTinh, String chuongHienTai) {
        this.idLon = idLon;
        this.tenLon = tenLon;
        this.trongLuong = trongLuong;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.chuongHienTai = chuongHienTai;
    }

    public Lon() {
    }

    public Lon(String tenLon, Integer trongLuong, Integer tuoi, String gioiTinh, String chuongHienTai) {
        this.tenLon = tenLon;
        this.trongLuong = trongLuong;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.chuongHienTai = chuongHienTai;
    }

    public Integer getIdLon() {
        return idLon;
    }

    public void setIdLon(Integer idLon) {
        this.idLon = idLon;
    }

    public String getTenLon() {
        return tenLon;
    }

    public void setTenLon(String tenLon) {
        this.tenLon = tenLon;
    }

    public Integer getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(Integer trongLuong) {
        this.trongLuong = trongLuong;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChuongHienTai() {
        return chuongHienTai;
    }

    public void setChuongHienTai(String chuongHienTai) {
        this.chuongHienTai = chuongHienTai;
    }
}
