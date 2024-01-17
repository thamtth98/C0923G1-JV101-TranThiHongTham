package com.codegym.demo_springboot.controller;

import com.codegym.demo_springboot.model.Student;
import com.codegym.demo_springboot.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/student")
public class StudentController{

    //DI
    private final IStudentService iStudentService;

    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    //    @RequestMapping(value = "",method = RequestMethod.GET)
    @GetMapping(value = "")
    public String showList(Model model) {
        model.addAttribute("listStudent", iStudentService.getAll());
        return "list";
    }

    @GetMapping("/detail")
    public ModelAndView showDetailByParam(@RequestParam("id") Integer codeStudent) {
//        Student student = iStudentService.getStudentById(codeStudent);
//        model.addAttribute("student", student);
//        return "detail";
        return new ModelAndView("detail", "student", iStudentService.getStudentById(codeStudent));
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetailByPathVariable(@PathVariable("id") Integer codeStudent) {
//        Student student = iStudentService.getStudentById(codeStudent);
//        model.addAttribute("student", student);
//        return "detail";
        return new ModelAndView("detail", "student", iStudentService.getStudentById(codeStudent));
    }

    @GetMapping("/create")
    public String showPageCreate(Model model) {
        model.addAttribute("student", new Student(0,"", 0.0, 0));
        model.addAttribute("listGender", new String[] {"0","1","2"});
        return "create";
    }

    @PostMapping("/create")
    public String addStudent(@ModelAttribute("student")Student student, BindingResult bindingResult,
                             RedirectAttributes redirect) {
       iStudentService.save(student);
       redirect.addFlashAttribute("msg", "Thêm mới thành công");
       return "redirect:/student";
    }

}
