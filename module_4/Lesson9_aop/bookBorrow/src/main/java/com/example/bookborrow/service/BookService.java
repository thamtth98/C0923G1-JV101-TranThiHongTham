package com.example.bookborrow.service;

import com.example.bookborrow.model.Book;
import com.example.bookborrow.model.CodeBook;
import com.example.bookborrow.model.User;
import com.example.bookborrow.repository.IBookRepository;
import com.example.bookborrow.repository.ICodeRepository;
import com.example.bookborrow.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepository iBookRepository;
    @Autowired
    private ICodeRepository iCodeRepository;
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return iBookRepository.findById(id).get();
    }

    @Override
    public void saveUser(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void saveCode(CodeBook codeBook) {
        iCodeRepository.save(codeBook);
    }

    @Override
    public List<CodeBook> findAllCodeBook() {
        return iCodeRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        iBookRepository.save(book);
    }
}
