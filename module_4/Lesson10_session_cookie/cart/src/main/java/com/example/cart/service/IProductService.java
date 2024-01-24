package com.example.cart.service;

import com.example.cart.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Integer id);
}
