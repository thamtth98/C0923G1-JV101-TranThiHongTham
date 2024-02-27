package com.example.exam.service;

import com.example.exam.model.Song;
import com.example.exam.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Auditable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository iSongRepository;
    @Override
    public Page<Song> findAll(Pageable pageable) {
        return iSongRepository.findAll(pageable);
    }

    @Override
    public void save(Song song) {
        iSongRepository.save(song);
    }

//    @Override
//    public List<Song> findAll() {
//        return iSongRepository.findAll();
//    }

    @Override
    public List<Song> findByNameSongContaining(String nameSearch) {
        return iSongRepository.findByNameSongContaining(nameSearch);
    }
}
