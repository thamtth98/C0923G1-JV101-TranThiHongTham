package com.example.connectbookbe.service;

import com.example.connectbookbe.models.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
}
