package com.example.book.model;

import jakarta.persistence.*;

@Entity
public class CodeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBorrow;
    private Integer idBookCode;

    public CodeBook(Long idBorrow, Integer idBookCode) {
        this.idBorrow = idBorrow;
        this.idBookCode = idBookCode;
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
}
