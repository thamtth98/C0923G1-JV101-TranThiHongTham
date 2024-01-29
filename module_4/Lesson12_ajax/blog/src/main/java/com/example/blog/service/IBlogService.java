package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(int idBlog);

    void delete(Blog blog);

    Page<Blog> findAllPage(Pageable pageable);

    List<Blog> findByTitle(String title);
}
