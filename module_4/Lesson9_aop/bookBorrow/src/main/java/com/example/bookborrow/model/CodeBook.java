package com.example.bookborrow.model;

import jakarta.persistence.*;

@Entity
public class CodeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBorrow;
    private String idBookCode;
    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;

    public CodeBook(Integer idBorrow, String idBookCode, Book book) {
        this.idBorrow = idBorrow;
        this.idBookCode = idBookCode;
        this.book = book;
    }

    public CodeBook() {
    }

    public Integer getIdBorrow() {
        return idBorrow;
    }

    public void setIdBorrow(Integer idBorrow) {
        this.idBorrow = idBorrow;
    }

    public String getIdBookCode() {
        return idBookCode;
    }

    public void setIdBookCode(String idBookCode) {
        this.idBookCode = idBookCode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
