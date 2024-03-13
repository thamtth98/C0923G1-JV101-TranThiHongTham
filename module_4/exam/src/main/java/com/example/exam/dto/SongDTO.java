package com.example.exam.dto;

import com.example.exam.model.Category;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;

public class SongDTO {
    private Integer idSong;
    @NotNull
    private String codeSong;
    @NotNull
    @Size(min = 1,max = 80)
    private String nameSong;
    @NotNull
    private String nameAuthor;
    @NotNull
    private LocalDate dateSong;
    @NotNull
    private String detailSong;
    private Category category;


    public SongDTO(Integer idSong, String codeSong, String nameSong, String nameAuthor, LocalDate dateSong, String detailSong, Category category) {
        this.idSong = idSong;
        this.codeSong = codeSong;
        this.nameSong = nameSong;
        this.nameAuthor = nameAuthor;
        this.dateSong = dateSong;
        this.detailSong = detailSong;
        this.category = category;
    }

    public SongDTO() {
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
