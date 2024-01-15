package com.example.product_manage.repository;

import com.example.product_manage.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showList();

    void saveProduct(Product product);

    Product findById(int id);

    void update(Integer id,Product product);

    void deleted(Product product);

    List<Product> findByName(String searchName);
}
