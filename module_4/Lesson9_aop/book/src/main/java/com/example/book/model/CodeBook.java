package com.example.book.model;

import jakarta.persistence.*;

@Entity
public class CodeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBorrow;
    private Integer idBookCode;
    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;


    public CodeBook(Long idBorrow, Integer idBookCode, Book book) {
        this.idBorrow = idBorrow;
        this.idBookCode = idBookCode;
        this.book = book;
    }

    public CodeBook() {
    }

    public Long getIdBorrow() {
        return idBorrow;
    }

    public void setIdBorrow(Long idBorrow) {
        this.idBorrow = idBorrow;
    }

    public Integer getIdBookCode() {
        return idBookCode;
    }

    public void setIdBookCode(Integer idBookCode) {
        this.idBookCode = idBookCode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
