package com.example.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBlog;
    private String titleBlog;
    private String content;
    private String author;
//    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate postingDate;

    public Blog(String titleBlog, String content, String author) {
        this.titleBlog = titleBlog;
        this.content = content;
        this.author = author;
    }

    public Blog(int idBlog, String titleBlog, String content, String author, LocalDate postingDate) {
        this.idBlog = idBlog;
        this.titleBlog = titleBlog;
        this.content = content;
        this.author = author;
        this.postingDate = postingDate;
    }

    public Blog() {
    }

    public String getTitleBlog() {
        return titleBlog;
    }

    public int getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(int idBlog) {
        this.idBlog = idBlog;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public void setTitleBlog(String titleBlog) {
        this.titleBlog = titleBlog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
