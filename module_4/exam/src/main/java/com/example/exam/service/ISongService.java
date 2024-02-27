package com.example.exam.service;

import com.example.exam.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISongService {
    Page<Song> findAll(Pageable pageable);

    void save(Song song);

//    List<Song> findAll();

    List<Song> findByNameSongContaining(String nameSearch);
}
