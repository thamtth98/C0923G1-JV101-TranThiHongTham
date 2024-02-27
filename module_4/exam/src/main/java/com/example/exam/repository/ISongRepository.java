package com.example.exam.repository;

import com.example.exam.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISongRepository extends JpaRepository<Song,Integer> {
    List<Song> findByNameSongContaining(String nameSearch);
}
