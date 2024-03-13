package com.example.connectbookbe.controller;

import com.example.connectbookbe.models.Book;
import com.example.connectbookbe.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/Books")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping("/")
    public ResponseEntity<List<Book>> showList(){
        List<Book> bookList= iBookService.findAll();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }
}
