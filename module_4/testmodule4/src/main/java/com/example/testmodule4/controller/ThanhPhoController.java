package com.example.testmodule4.controller;

import com.example.testmodule4.modal.ThanhPho;
import com.example.testmodule4.service.IQuocGiaService;
import com.example.testmodule4.service.IThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/thanhpho")
public class ThanhPhoController {
    @Autowired
    private IThanhPhoService thanhPhoService;
    @Autowired
    private IQuocGiaService quocGiaService;
    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "0", required = false)Integer page){
        Pageable pageable = PageRequest.of(page,1);
        Page<ThanhPho> phoPage = thanhPhoService.findAll(pageable);
        model.addAttribute("phoPage",phoPage);
        return "list";
    }
//    @GetMapping("showList")
//    public String list(Model model, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page){
//        Pageable pageable = PageRequest.of(page,1);
//        Page<ThanhPho> thanhPhoPage = thanhPhoService.findAll(pageable);
//        model.addAttribute("thanhPhoPage",thanhPhoPage);
//    }
    @GetMapping("thanhpho/view/{idThanhPho}")
    public String viewThanhPho(@PathVariable ("idThanhPho") Integer idThanhPho,Model model){
        ThanhPho thanhPho = thanhPhoService.findById(idThanhPho);
        model.addAttribute("thanhPho", thanhPho);
        return "view";
    }

}
