package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;
    @GetMapping
    public String showList(Model model){
        List<Book> bookList = iBookService.findAll();
        model.addAttribute("bookList",bookList);
        return "home";
    }
//    @GetMapping("/{id}/detail")
//    public String showDetail(@PathVariable ("id")Integer id, Model model){
//
//    }

}
