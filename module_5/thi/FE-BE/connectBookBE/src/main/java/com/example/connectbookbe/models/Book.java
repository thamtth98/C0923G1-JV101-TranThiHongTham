package com.example.connectbookbe.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String idDisplay;
    private String name;
    private LocalDate date;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "id_type")
    private Type type;

    public Book(Integer id, String idDisplay, String name, LocalDate date, Integer quantity, Type type) {
        this.id = id;
        this.idDisplay = idDisplay;
        this.name = name;
        this.date = date;
        this.quantity = quantity;
        this.type = type;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdDisplay() {
        return idDisplay;
    }

    public void setIdDisplay(String idDisplay) {
        this.idDisplay = idDisplay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
