package com.example.translate.controller;

import com.example.translate.service.IWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/translate")
public class DictionaryController {

    @Autowired
    private IWordService wordService;
    @GetMapping
    public String formInput(){
        return "form";
    }
    @GetMapping("vietnamese")
    public String translate(HttpServletRequest request, Model model){
        String english = request.getParameter("english");
        String result = wordService.translate(english);
        model.addAttribute("english",english);
        model.addAttribute("result",result);
        return "form";
    }

}
