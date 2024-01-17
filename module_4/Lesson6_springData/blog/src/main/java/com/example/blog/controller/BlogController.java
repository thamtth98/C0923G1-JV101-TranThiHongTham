package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    private final IBlogService blogService;

    public BlogController(IBlogService blogService) {
        this.blogService = blogService;
    }
    @GetMapping()
    public String showBlog(Model model){
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogList",blogList);
        return "home";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String saveBlog(Blog blog, RedirectAttributes attributes){
        blogService.save(blog);
        attributes.addFlashAttribute("showMessage","Add success!");
        return "redirect:/blog";
    }

    @GetMapping("/detail/{idBlog}")
    public String detailBlog(@PathVariable int idBlog,Model model){
        Blog blog = blogService.findById(idBlog);
        model.addAttribute("blog",blog);
        return "detail";
    }
    @GetMapping("/edit/{idBlog}")
    public String showEdit(@PathVariable int idBlog, RedirectAttributes attributes){
        Blog blog = blogService.findById(idBlog);
        blogService.save(blog);
        attributes.addFlashAttribute("showMessage","Edit success!");
        return "redirect:/blog";
    }

    @GetMapping("/delete/{idBlog}")
    public String deleteBlog(@PathVariable int idBlog, RedirectAttributes attributes){
        Blog blog = blogService.findById(idBlog);
        blogService.delete(blog);
        attributes.addFlashAttribute("showMessage","Edit success!");
        return "redirect:/blog";
    }

}
