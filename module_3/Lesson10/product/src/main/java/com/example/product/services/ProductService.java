package com.example.product.services;

import com.example.product.models.Product;
import com.example.product.repositories.IProductRepository;
import com.example.product.repositories.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> showProductList() {
        return iProductRepository.showProductList();
    }

    @Override
    public void createProduct(Product product) {
        iProductRepository.createProduct(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void edit(int id, Product product) {
        iProductRepository.edit(id,product);
    }

    @Override
    public void deleteProduct(Product product) {
        iProductRepository.deleteProduct(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductRepository.findByName(name);
    }


}
