package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import com.example.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @ModelAttribute("cart")
    public Cart cart(){
        return new Cart();
    }

    @GetMapping()
    public String showListProduct(Model model) {
        Iterable<Product> productList = iProductService.findAll();
        model.addAttribute("productList",productList);
        return "home";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id, Model model){
        Optional<Product> productOptional = iProductService.findById(id);
        if (productOptional.isPresent()) {
            System.out.println(productOptional.get().getName());
            Product product = productOptional.get();
            model.addAttribute("product",product);
            return "detail";
        } else {
            return ("error");
        }
    }

    @GetMapping("/cart/{id}")
    public String addToCart(@PathVariable Integer id,
                            @ModelAttribute("cart") Cart cart) {
        Optional<Product> product = iProductService.findById(id);
        if (!product.isPresent()) {
            return "error";
        }
        cart.addProduct(product.get());
        System.out.println(cart.getProducts().size());
        return "redirect:/product";
    }
}
