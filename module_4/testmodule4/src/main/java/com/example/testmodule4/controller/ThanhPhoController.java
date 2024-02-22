package com.example.testmodule4.controller;

import com.example.testmodule4.modal.QuocGia;
import com.example.testmodule4.modal.ThanhPho;
import com.example.testmodule4.service.IQuocGiaService;
import com.example.testmodule4.service.IThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/city")
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
    @GetMapping("/view/{idThanhPho}")
    public String viewThanhPho(@PathVariable ("idThanhPho") Integer idThanhPho,Model model){
        ThanhPho thanhPho = thanhPhoService.findById(idThanhPho);
        model.addAttribute("thanhPho", thanhPho);
        return "view";
    }
    @GetMapping("/edit/{idThanhPho}")
    public String editThanhPho(@PathVariable ("idThanhPho") Integer idThanhPho,Model model){
        ThanhPho thanhPho = thanhPhoService.findById(idThanhPho);
        List<QuocGia> quocGia = quocGiaService.findAll();

        model.addAttribute("thanhPho", thanhPho);
        model.addAttribute("quocGia", quocGia);
        return "edit";
    }
    @PostMapping("/edit")
    public String submitEdit(@ModelAttribute ("thanhPho") ThanhPho thanhPho, RedirectAttributes redirectAttributes){
        thanhPhoService.save(thanhPho);
        redirectAttributes.addFlashAttribute("message","Sửa thành công");
        return "redirect:/city/list";
    }
    @GetMapping("/delete/{idThanhPho}")
    public String deleteCity(@PathVariable ("idThanhPho") Integer idThanhPho, RedirectAttributes attributes){
        thanhPhoService.deleteCity(idThanhPho);
        attributes.addFlashAttribute("message", "Xóa thành công!!");
        return "redirect:/city/list";
    }
    @GetMapping("/add")
    public String addCity(Model model){
        List<QuocGia> quocGia = quocGiaService.findAll();
        model.addAttribute("quocGia",quocGia);
        model.addAttribute("thanhPho",new ThanhPho());
        return "create";
    }
    @PostMapping("/add")
    public String submitAdd(@ModelAttribute ("thanhPho") ThanhPho thanhPho, RedirectAttributes attributes){
        thanhPhoService.addCity(thanhPho);
        attributes.addFlashAttribute("message","Thêm mới thành công");
        return "redirect:/city/list";
    }

}
