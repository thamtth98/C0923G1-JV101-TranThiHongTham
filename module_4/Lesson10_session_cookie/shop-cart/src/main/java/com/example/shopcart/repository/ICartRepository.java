package com.example.shopcart.repository;

import com.example.shopcart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<Cart,Integer> {
}
