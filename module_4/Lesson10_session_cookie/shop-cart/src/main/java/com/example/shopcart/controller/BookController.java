package com.example.shopcart.controller;

import com.example.shopcart.model.Book;
import com.example.shopcart.model.Cart;
import com.example.shopcart.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

    @Controller
    @SessionAttributes("cart")
    @RequestMapping("/book")
    public class BookController {
        @Autowired
        private IBookService bookService;
        @ModelAttribute("cart")
        public Cart cart(){
            return new Cart();
        }

        @GetMapping()
        public String showListBook(Model model) {
            Iterable<Book> bookList = bookService.findAll();
            model.addAttribute("bookList",bookList);
            return "home";
        }

        @GetMapping("/detail/{id}")
        public String detail(@PathVariable Integer id, Model model){
            Optional<Book> productOptional = bookService.findById(id);
            if (productOptional.isPresent()) {
                System.out.println(productOptional.get().getName());
                Book book = productOptional.get();
                model.addAttribute("product",book);
                return "detail";
            } else {
                return ("error");
            }
        }

        @GetMapping("/cart/{id}")
        public String addToCart(@PathVariable Integer id,
                                @ModelAttribute("cart") Cart cart) {
            Optional<Book> bookOptional = bookService.findById(id);
            if (!bookOptional.isPresent()) {
                return "error";
            }
//            cart.addBook(bookOptional);
            System.out.println(cart.getProducts().size());
            return "redirect:/product";
        }
    }

