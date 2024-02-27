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
    private Integer idSongDTO;
    @NotNull
    private String codeSong;
    @NotNull
    @Size(min = 1,max = 80)
    private String nameSongDTO;
    @NotNull
    private String nameAuthorDTO;
    @NotNull
    private LocalDate dateSongDTO;
    @NotNull
    private String detailSongDTO;
    private Category category;

    public SongDTO(Integer idSongDTO, String codeSongDTO, String nameSongDTO, String nameAuthorDTO, LocalDate dateSongDTO, String detailSongDTO, Category category) {
        this.idSongDTO = idSongDTO;
        this.codeSong = codeSongDTO;
        this.nameSongDTO = nameSongDTO;
        this.nameAuthorDTO = nameAuthorDTO;
        this.dateSongDTO = dateSongDTO;
        this.detailSongDTO = detailSongDTO;
        this.category = category;
    }

    public SongDTO() {
    }

    public Integer getIdSongDTO() {
        return idSongDTO;
    }

    public void setIdSongDTO(Integer idSongDTO) {
        this.idSongDTO = idSongDTO;
    }

    public String getCodeSong() {
        return codeSong;
    }

    public void setCodeSong(String codeSongDTO) {
        this.codeSong = codeSongDTO;
    }

    public String getNameSongDTO() {
        return nameSongDTO;
    }

    public void setNameSongDTO(String nameSongDTO) {
        this.nameSongDTO = nameSongDTO;
    }

    public String getNameAuthorDTO() {
        return nameAuthorDTO;
    }

    public void setNameAuthorDTO(String nameAuthorDTO) {
        this.nameAuthorDTO = nameAuthorDTO;
    }

    public LocalDate getDateSongDTO() {
        return dateSongDTO;
    }

    public void setDateSongDTO(LocalDate dateSongDTO) {
        this.dateSongDTO = dateSongDTO;
    }

    public String getDetailSongDTO() {
        return detailSongDTO;
    }

    public void setDetailSongDTO(String detailSongDTO) {
        this.detailSongDTO = detailSongDTO;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
