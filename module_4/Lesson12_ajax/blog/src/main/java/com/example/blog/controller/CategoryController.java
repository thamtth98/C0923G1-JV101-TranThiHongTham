package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.ICategoryService;
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
@RequestMapping("/category")
public class CategoryController {
    private final ICategoryService iCategoryService;

    public CategoryController(ICategoryService iCategoryService) {
        this.iCategoryService = iCategoryService;
    }

    @GetMapping()
    public String showCategory(Model model){
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categoryList",categoryList);
        return "category/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("category",new Category());
        return "category/create";
    }
    @PostMapping("/create")
    public String create(Category category, RedirectAttributes redirectAttributes){
        iCategoryService.save(category);
        redirectAttributes.addFlashAttribute("message","Add new success!");
        return "redirect:/category";
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
