package com.example.testmodule4.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCity;
    private String nameCity;
    private Double area;
    private Long danSo;
    private Double GDP;
    private String moTa;
    @ManyToOne
    @JoinColumn(name = "id_national", referencedColumnName = "idNational")
    private QuocGia quocGia;

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getDanSo() {
        return danSo;
    }

    public void setDanSo(Long danSo) {
        this.danSo = danSo;
    }

    public Double getGDP() {
        return GDP;
    }

    public void setGDP(Double GDP) {
        this.GDP = GDP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }
}
