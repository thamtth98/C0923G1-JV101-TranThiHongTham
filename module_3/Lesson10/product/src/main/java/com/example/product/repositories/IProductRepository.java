package com.example.product.repositories;

import com.example.product.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showProductList();

    void createProduct(Product product);

    Product findById(int id);

    void edit(int id,Product product);

    void deleteProduct(Product product);

    List<Product> findByName(String name);
}
