package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class SandwichController {
    @GetMapping("")
    public String formSandwich(){
        System.out.println("hello");
        return "/form";
    }
}
