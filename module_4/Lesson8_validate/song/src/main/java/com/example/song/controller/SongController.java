package com.example.song.controller;

import com.example.song.dto.SongDTO;
import com.example.song.model.Song;
import com.example.song.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService iSongService;
    @GetMapping()
    public String home(Model model) {
        List<Song> songList = iSongService.findAll();
        model.addAttribute("songList",songList);
        return "home";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping("/create")
    public String createSong(@Validated SongDTO songDTO, BindingResult bindingResult, RedirectAttributes attributes){
        if(bindingResult.hasFieldErrors()){
            return "create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDTO,song);
        iSongService.save(song);
        attributes.addFlashAttribute("message","Add new success!!");
        return "redirect:/song";
    }
}
