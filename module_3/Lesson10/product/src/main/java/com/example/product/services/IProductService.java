package com.example.product.services;

import com.example.product.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> showProductList();

    void createProduct(Product product);

    Product findById(int id);

    void edit(int id,Product product);

    void deleteProduct(Product product);
}
