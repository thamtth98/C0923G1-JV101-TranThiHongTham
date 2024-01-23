package com.example.bookborrow.controller;

import com.example.bookborrow.model.Book;
import com.example.bookborrow.model.CodeBook;
import com.example.bookborrow.model.User;
import com.example.bookborrow.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping
    public String showList(Model model) {
        List<Book> bookList = iBookService.findAll();
        model.addAttribute("bookList", bookList);
        return "home";
    }

    @GetMapping("/{id}/detail")
    public String showDetail(@PathVariable Integer id,
                             Model model) {
        Book book = iBookService.findById(id);
        model.addAttribute("book", book);
        return "detail";
    }

    @GetMapping("/{id}/borrow")
    public String borrow(@PathVariable Integer id,
                         Model model) {
        model.addAttribute("book", iBookService.findById(id));
        model.addAttribute("user", new User());
        return "borrow";
    }

    @PostMapping("/{id}/borrow")
    public String userBorrow(@PathVariable Integer id,
                             @ModelAttribute User user,
                             RedirectAttributes attributes) {
        iBookService.saveUser(user);
        CodeBook codeBook = new CodeBook();
        Book book = iBookService.findById(id);
        book.setQuantity(book.getQuantity() - 1);
        codeBook.setBook(book);
        codeBook.setIdBookCode(getRandomCode());
        iBookService.saveCode(codeBook);
        attributes.addFlashAttribute("message", "Code của bạn là " + codeBook.getIdBookCode());
        return "redirect:/book";

    }

    private String getRandomCode() {
        Random random = new Random();
        int randomNumber = random.nextInt(90000) + 10000;
        return String.valueOf(randomNumber);
    }
    @GetMapping("/{id}/return")
    public String returnBook() {
        return "checkCode";
    }
    @PostMapping("/{id}/return")
    public String returnBook(@RequestParam("code") String code,
                             @PathVariable Integer id){
        Book book = iBookService.findById(id);
        List<CodeBook> codeBooks = iBookService.findAllCodeBook();
        for (CodeBook codeBook: codeBooks){
            if (codeBook.getIdBookCode().equals(code)){
                book.setQuantity(book.getQuantity()+1);
                return "redirect:/book";
            }
        }
        return "error";
    }


}
