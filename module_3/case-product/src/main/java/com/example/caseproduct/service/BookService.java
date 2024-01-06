package com.example.caseproduct.service;

import com.example.caseproduct.model.Book;
import com.example.caseproduct.repository.BookRepository;
import com.example.caseproduct.repository.IBookRepository;

import java.sql.SQLException;
import java.util.List;

public class BookService implements IBookService{
    private IBookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> showBookList(String typeBook) {
        return bookRepository.showBookList(typeBook);
    }

    @Override
    public Book findById(int idBook) {
        return bookRepository.findById(idBook);
    }

    @Override
    public List<Book> findByName(String nameBook) {
        return bookRepository.findByName(nameBook);
    }
}
