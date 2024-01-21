package com.example.song.service;

import com.example.song.model.Song;
import com.example.song.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository iSongRepository;
    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }
}
