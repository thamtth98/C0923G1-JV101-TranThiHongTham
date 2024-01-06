package com.example.caseproduct.repository;

import com.example.caseproduct.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface IBookRepository {

    List<Book> showBookList(String typeBook);

    Book findById(int idBook);

    List<Book> findByName(String nameBook);
}
