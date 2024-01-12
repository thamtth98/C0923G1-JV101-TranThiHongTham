package com.example.mailbox.controller;

import com.example.mailbox.model.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/mail")
public class MailController {


    @GetMapping("")
    public String showFormMail(Model model){
        model.addAttribute("mail",new Mail("English",25,false,"Thor"));
        model.addAttribute("listLanguage",new String[] {"English","Vietnamese","Japanese","Chinese"});
        model.addAttribute("listPageSize",new String[] {"5", "10", "15", "25", "50", "100" });
        return "formEdit";
    }

    @PostMapping("/edit")
    public String editMail(@ModelAttribute("mail")Mail mail,
                           Model model){
        model.addAttribute("languages",mail.getLanguages());
        model.addAttribute("pageSize",mail.getPageSize());
        model.addAttribute("spamsFilter",mail.getSpamsFilter());
        model.addAttribute("signature",mail.getSignature());
        return "edit";
    }





}
