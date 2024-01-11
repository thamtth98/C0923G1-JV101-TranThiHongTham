package com.example.sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @GetMapping("")
    public String formSandwich(){
        return "form";
    }
    @GetMapping("/list")
    public String listSandwich(@RequestParam(value = "item", defaultValue = "No choice") String[] condiments, Model model){
        model.addAttribute("condiments", condiments);
        return "form";
    }

}
