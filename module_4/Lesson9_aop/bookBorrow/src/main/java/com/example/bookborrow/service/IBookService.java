package com.example.bookborrow.service;

import com.example.bookborrow.model.Book;
import com.example.bookborrow.model.CodeBook;
import com.example.bookborrow.model.User;

import java.util.List;

public interface IBookService {

    List<Book> findAll();

    Book findById(Integer id);


    void saveUser(User user);

    void saveCode(CodeBook codeBook);

    List<CodeBook> findAllCodeBook();

    void saveBook(Book book);
}
