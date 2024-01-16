package com.example.product_manage.service;

import com.example.product_manage.model.Product;
import com.example.product_manage.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private final IProductRepository productRepository;
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> showList() {
        return productRepository.showList();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(Integer id, Product product) {
        productRepository.update(id,product);
    }

    @Override
    public void deleted(Product product) {
        productRepository.deleted(product);
    }

    @Override
    public List<Product> findByName(String searchName) {
        return productRepository.findByName(searchName);
    }
}
