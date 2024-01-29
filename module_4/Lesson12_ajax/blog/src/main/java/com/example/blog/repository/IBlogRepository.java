package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where title_blog like %:title%", nativeQuery = true)
    List<Blog> findByTitle(@Param("title")String title);
}
