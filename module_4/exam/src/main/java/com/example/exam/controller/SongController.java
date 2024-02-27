package com.example.exam.controller;

import com.example.exam.dto.SongDTO;
import com.example.exam.model.Category;
import com.example.exam.model.Song;
import com.example.exam.service.ICategoryService;
import com.example.exam.service.ISongService;
import com.example.exam.service.SongService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SimpleTimeZone;


@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService songService;
    @Autowired
    private ICategoryService categoryService;
    @GetMapping("/list")
    public String showList(@RequestParam(value = "page",required = false,defaultValue = "0") Integer page, Model model){
        Pageable pageable = PageRequest.of(page,2);
//        List<Song> songList = songService.findAll();
        Page<Song> songPage = songService.findAll(pageable);
        model.addAttribute("songPage",songPage);
        return "list";
    }
    @GetMapping("/create")
    public String createSong(Model model){
        List<Category> categoryList = categoryService.findAll();
        SongDTO songDTO = new SongDTO();
        model.addAttribute("songDTO",songDTO);
        model.addAttribute("categoryList",categoryList);
        return "create";
    }
    @PostMapping("/create")
    public String submitCreate(@Validated @ModelAttribute ("songDTO") SongDTO songDTO, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            List<Category> categoryList = categoryService.findAll();
            model.addAttribute("categoryList",categoryList);
            return "create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDTO,song);
        songService.save(song);
        List<Category> categoryList = categoryService.findAll();
//        List<Song> songList = songService.findAll();
//        Page<Song> songPage = songService.findAll(pageable);
//        Page<Song> songPage = songService.findAll(pageable);

//        model.addAttribute("songPage",songPage);
        model.addAttribute("categoryList",categoryList);
        return "/list";
    }
    @GetMapping("/search")
    public String search(@RequestParam ("nameSearch") String nameSearch, Model model){
        List<Song> songList = songService.findByNameSongContaining(nameSearch);
        model.addAttribute("songList",songList);
        return "list";
    }




}
