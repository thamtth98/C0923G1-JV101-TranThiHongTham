package com.example.currency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/convert")
public class CurrencyController {

    @GetMapping
    public String showConvert() {
        return "form";
    }

    @GetMapping("/calculate")
    public String calculate(HttpServletRequest request) {
        int usd = Integer.parseInt(request.getParameter("usd"));
        int rate = Integer.parseInt(request.getParameter("rate"));
        int result = usd * rate;
        request.setAttribute("result", result);
        request.setAttribute("usd", usd);
        request.setAttribute("rate", rate);
        return "form";
    }
}
