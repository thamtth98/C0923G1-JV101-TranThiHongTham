package com.example.song.controller;

import com.example.song.model.Song;
import com.example.song.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
