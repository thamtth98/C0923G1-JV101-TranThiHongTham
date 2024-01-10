package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import com.example.customer.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    private ICustomerService customerService;
    @GetMapping("/customers")
    public String showList(HttpServletRequest request){
        List<Customer> customerList ;
        return "customers/list.jsp";
    }
}
