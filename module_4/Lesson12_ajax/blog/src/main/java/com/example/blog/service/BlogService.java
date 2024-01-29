package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        blog.setPostingDate(LocalDate.now());
        blogRepository.save(blog);
    }

    @Override
    public Blog findById(int idBlog) {
        return blogRepository.findById(idBlog).get();
    }

    @Override
    public void delete(Blog blog) {
        blogRepository.delete(blog);
    }

    @Override
    public Page<Blog> findAllPage(Pageable pageable) {
        return this.blogRepository.findAll(pageable);
    }

    @Override
    public List<Blog> findByTitle(String title) {
        return blogRepository.findByTitle(title);
    }

}
