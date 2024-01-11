package com.example.calculate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/calculator")
public class CalculateController {
    @GetMapping
    public String formCalculate(){
        return "form";
    }
    @PostMapping("/calculate")
    public String calculate(@RequestParam(name = "firstNumber", defaultValue = "0") double firstNumber,
                            @RequestParam(name = "secondNumber",defaultValue = "0") double secondNumber,
                            @RequestParam(name = "operator") String operator,
                            Model model){
        model.addAttribute("firstNumber",firstNumber);
        model.addAttribute("secondNumber",secondNumber);

        switch (operator){
            case "add":
                model.addAttribute("operator","Addition");
                model.addAttribute("result",firstNumber+secondNumber);
                break;
            case "sub":
                model.addAttribute("operator","Subtraction");
                model.addAttribute("result",firstNumber-secondNumber);
                break;
            case "mul":
                model.addAttribute("operator","Multiplication");
                model.addAttribute("result",firstNumber * secondNumber);
                break;
            case "div":
                if(secondNumber == 0){
                    model.addAttribute("result","Cannot divide by 0");
                }else {
                    model.addAttribute("operator","Division");
                    model.addAttribute("result",firstNumber / secondNumber);
                }
                break;
        }
        return "form";
    }
}
