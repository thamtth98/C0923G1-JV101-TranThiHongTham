package com.example.connectbookbe.repository;

import com.example.connectbookbe.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer> {
//    @Query(value = "select * from ")
}
