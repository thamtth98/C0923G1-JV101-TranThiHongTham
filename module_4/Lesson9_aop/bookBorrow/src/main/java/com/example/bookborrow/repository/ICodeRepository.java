package com.example.bookborrow.repository;

import com.example.bookborrow.model.CodeBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICodeRepository extends JpaRepository<CodeBook,Integer> {
}
