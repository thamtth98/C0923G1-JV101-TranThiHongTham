package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    private final IBlogService blogService;

    public BlogController(IBlogService blogService) {
        this.blogService = blogService;
    }

    @Autowired
    private ICategoryService categoryService;

    @GetMapping()
    public ResponseEntity<List<Blog>> showBlog() {
        return new ResponseEntity<>(blogService.findAll(), HttpStatus.OK);
    }


    @PostMapping("")
    public ResponseEntity<Void> saveBlog(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/detail/{idBlog}")
    public ResponseEntity<Blog> detailBlog(@PathVariable int idBlog) {
        return new ResponseEntity<>(blogService.findById(idBlog), HttpStatus.OK);
    }


    @GetMapping("/edit/{idBlog}")
    public String showEdit(@PathVariable int idBlog, Model model) {
        model.addAttribute("categories", categoryService.findAll());
        Blog blog = blogService.findById(idBlog);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Blog blog, RedirectAttributes attributes) {
        blogService.save(blog);
        attributes.addFlashAttribute("showMessage", "Edit success!");
        return "redirect:/blog";
    }

    @GetMapping("/delete/{idBlog}")
    public String deleteBlog(@PathVariable Integer idBlog, RedirectAttributes attributes) {
        Blog blog = blogService.findById(idBlog);
        blogService.delete(blog);
        attributes.addFlashAttribute("showMessage", "Delete success!");
        return "redirect:/blog";
    }

}
