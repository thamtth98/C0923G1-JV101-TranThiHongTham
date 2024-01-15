package com.example.product_manage.repository;

import com.example.product_manage.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone11", 12000, "New", "Apple"));
        productList.add(new Product(2, "Iphone11 promax", 14000, "New", "Apple"));
        productList.add(new Product(3, "Iphone12", 15000, "New", "Apple"));
    }

    @Override
    public List<Product> showList() {
        return productList;
    }

    @Override
    public void saveProduct(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Integer id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.set(i, product);
                break;
            }
        }

    }

    @Override
    public void deleted(Product product) {
        productList.remove(product);
    }

    @Override
    public List<Product> findByName(String searchName) {
        List<Product> nameList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(searchName)) {
                nameList.add(product);
            }
        }
        return nameList;
    }
}
