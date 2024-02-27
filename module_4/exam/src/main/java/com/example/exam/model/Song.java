package com.example.exam.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Locale;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSong;
    private String codeSong;
    private String nameSong;
    private String nameAuthor;
    private LocalDate dateSong;
    private String detailSong;
    @ManyToOne
    @JoinColumn(name = "id_category",referencedColumnName = "idCategory")
    private Category category;

    public Song(Integer idSong, String codeSong, String nameSong, String nameAuthor, LocalDate dateSong, String detailSong, Category category) {
        this.idSong = idSong;
        this.codeSong = codeSong;
        this.nameSong = nameSong;
        this.nameAuthor = nameAuthor;
        this.dateSong = dateSong;
        this.detailSong = detailSong;
        this.category = category;
    }

    public Song() {
    }

    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public String getCodeSong() {
        return codeSong;
    }

    public void setCodeSong(String codeSong) {
        this.codeSong = codeSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public LocalDate getDateSong() {
        return dateSong;
    }

    public void setDateSong(LocalDate dateSong) {
        this.dateSong = dateSong;
    }

    public String getDetailSong() {
        return detailSong;
    }

    public void setDetailSong(String detailSong) {
        this.detailSong = detailSong;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
