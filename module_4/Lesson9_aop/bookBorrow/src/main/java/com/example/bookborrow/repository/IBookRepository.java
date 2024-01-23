package com.example.bookborrow.repository;

import com.example.bookborrow.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}
