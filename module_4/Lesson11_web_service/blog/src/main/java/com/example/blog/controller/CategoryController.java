package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final ICategoryService iCategoryService;

    public CategoryController(ICategoryService iCategoryService) {
        this.iCategoryService = iCategoryService;
    }

    @GetMapping()
    public ResponseEntity<List<Category>> showCategory(){
        return new ResponseEntity<>(iCategoryService.findAll(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody Category category){
        iCategoryService.save(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("edit/{idCategory}")
    public String showEdit(@PathVariable ("idCategory") Integer idCategory, Model model){
        Category category = iCategoryService.findById(idCategory);
        model.addAttribute("category",category);
        return "category/edit";
    }

    @PostMapping("edit")
    public String edit(Category category, RedirectAttributes redirectAttributes){
        iCategoryService.save(category);
        redirectAttributes.addFlashAttribute("message","Edit success!");
        return "redirect:/category";
    }
    @GetMapping("delete/{idCategory}")
    public String showDel(@PathVariable ("idCategory") Integer idCategory, Model model){
        Category category = iCategoryService.findById(idCategory);
        model.addAttribute("category",category);
        return "category/delete";
    }
    @PostMapping("delete")
    public String delete(Category category, RedirectAttributes redirectAttributes){
        iCategoryService.delete(category);
        redirectAttributes.addFlashAttribute("message","Delete success!");
        return "redirect:/category";
    }

}
