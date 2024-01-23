package com.example.bookborrow.repository;

import com.example.bookborrow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
