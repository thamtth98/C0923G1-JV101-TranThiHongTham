package com.example.product_manage.model;

import javax.persistence.*;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer id;
    private String name;
    private Integer price;
    private String pDescribe;
    private String producer;

    public Product(Integer id, String name, Integer price, String pDescribe, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pDescribe = pDescribe;
        this.producer = producer;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPDescribe() {
        return pDescribe;
    }

    public void setPDescribe(String describe) {
        this.pDescribe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
