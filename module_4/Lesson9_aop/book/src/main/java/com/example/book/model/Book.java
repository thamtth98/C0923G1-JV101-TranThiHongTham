package com.example.book.model;

import jakarta.persistence.*;

import java.util.Set;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook;
    private String nameBook;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "id_book_code")
    private CodeBook codeBooks;

    public Book(Integer idBook, String nameBook, Integer quantity) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.quantity = quantity;
    }

    public Book(Integer idBook, String nameBook, Integer quantity, CodeBook codeBooks) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.quantity = quantity;
        this.codeBooks = codeBooks;
    }

    public Book() {
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CodeBook getCodeBooks() {
        return codeBooks;
    }

    public void setCodeBooks(CodeBook codeBooks) {
        this.codeBooks = codeBooks;
    }
}
