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
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
@CrossOrigin("*")
public class BlogController {

    private final IBlogService blogService;

    public BlogController(IBlogService blogService) {
        this.blogService = blogService;
    }

    @Autowired
    private ICategoryService categoryService;

//    @GetMapping()
//    public String showBlog(Model model, @RequestParam(defaultValue = "0", required = false) Integer page) {
//        Pageable pageable = PageRequest.of(page, 2, Sort.Direction.valueOf("ASC"), "postingDate");
//        Page<Blog> blogPage = this.blogService.findAllPage(pageable);
//        model.addAttribute("blogList", blogPage);
//        return "home";
//    }
@GetMapping()
public ResponseEntity<List<Blog>> showBlog(Model model){
    return  new ResponseEntity<>(blogService.findAll(),HttpStatus.OK);
}
    @GetMapping("/search/{titleBlog}")
    public ResponseEntity<List<Blog>> findBlogByName(@PathVariable String titleBlog){
        List<Blog> blogList = blogService.findByTitle(titleBlog);
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(blogList,HttpStatus.OK);
        }
    }
    @GetMapping("/blog/page/{pageDisplay}")
    public ResponseEntity<List<Blog>> loadMore(@PathVariable Integer pageDisplay){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String saveBlog(Blog blog, RedirectAttributes attributes) {
        blogService.save(blog);
        attributes.addFlashAttribute("showMessage", "Add success!");
        return "redirect:/blog";
    }

    @GetMapping("/detail/{idBlog}")
    public String detailBlog(@PathVariable int idBlog, Model model) {
        Blog blog = blogService.findById(idBlog);
        model.addAttribute("blog", blog);
        return "detail";
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
