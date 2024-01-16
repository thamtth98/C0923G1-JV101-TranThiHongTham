package com.example.product_manage.controller;

import com.example.product_manage.model.Product;
import com.example.product_manage.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }
    @GetMapping("")
    public String showList(Model model){
        List<Product> productList = productService.showList();
        model.addAttribute("productList",productList);
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/save")
    public String saveProduct(Product product, RedirectAttributes attributes){
        productService.saveProduct(product);
        attributes.addFlashAttribute("showMessage","Add success!");
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes attributes){
        productService.update(product.getId(),product);
        attributes.addFlashAttribute("showMessage","Update success!");
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String delProduct(@PathVariable int id,Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "delete";
    }

    @PostMapping("/delete")
    public String deleted(Product product, RedirectAttributes attributes){
        product = productService.findById(product.getId());
        productService.deleted(product);
        attributes.addFlashAttribute("showMessage","Delete success!");
        return "redirect:/products";
    }
    @GetMapping("/view/{id}")
    public String viewDetail(@PathVariable int id,Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "view";
    }

    @GetMapping("/search")
    public String findByName(Model model,@RequestParam String name){
        List<Product> productList = productService.findByName(name);
        model.addAttribute("productList",productList);
        return "list";
    }
}
