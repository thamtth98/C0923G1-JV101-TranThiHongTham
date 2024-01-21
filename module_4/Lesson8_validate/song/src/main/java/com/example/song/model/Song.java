package com.example.song.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSong;
    @NotBlank(message = "Tên không được để trống")
    @Size(min = 1, max = 800, message = "Tên không quá 800 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9]+$",message = " Tên không thể chứa ký tự đặc biệt")
    private String nameSong;
    @NotBlank(message = "Ca sĩ không thể để trống")
    @Size(min = 1,max = 300,message = "Tên ca sĩ không thể quá 300 kí tự")
    @Pattern(regexp = "^[a-zA-Z0-9]+$",message = " Tên không thể chứa ký tự đặc biệt")
    private String singer;
    @NotBlank(message = "Thể loại không thể để trống")
    @Size(min = 1,max = 1000,message = "Thể loại không thể quá 300 kí tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\s,]+$",message = " Thể loại không thể chứa ký tự đặc biệt")
    private String kindOfMusic;

    public Song(Integer idSong, String nameSong, String singer, String kindOfMusic) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
    }

    public Song() {
    }

    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
