package com.example.caseproduct.service;

import com.example.caseproduct.model.Book;

import java.util.List;

public interface IBookService {

    List<Book> showBookList(String typeBook);

    Book findById(int idBook);

    List<Book> findByName(String nameBook);
}
