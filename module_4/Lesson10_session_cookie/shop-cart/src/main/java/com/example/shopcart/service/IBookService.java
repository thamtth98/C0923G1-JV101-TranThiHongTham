package com.example.shopcart.service;

import com.example.shopcart.model.Book;

import java.util.Optional;

public interface IBookService {
    Iterable<Book> findAll();

    Optional<Book> findById(Integer id);
}
