package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String showCart(@SessionAttribute("cart") Cart cart, Model model) {
        model.addAttribute("cart",cart);
        return "show-cart";
    }

}
