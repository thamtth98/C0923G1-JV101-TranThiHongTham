package com.example.form.controller;

import com.example.form.dto.UserDTO;
import com.example.form.model.User;
import com.example.form.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @GetMapping()
    public String showForm(Model model){
        model.addAttribute("user",new UserDTO());
        return "form";
    }

    @PostMapping("/create")
    public String createUser(@Validated UserDTO userDTO, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "form";
        }
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        iUserService.save(user);
        return "result";
    }

}
