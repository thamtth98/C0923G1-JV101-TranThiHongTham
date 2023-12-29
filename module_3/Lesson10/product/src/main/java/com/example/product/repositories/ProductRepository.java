package com.example.product.repositories;

import com.example.product.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    List<Product> productList= new ArrayList<>();
    {
        productList.add(new Product(1,"Bút",10000,"Mới","Thiên Long"));
        productList.add(new Product(2,"Vở",15000,"Mới","Thiên Long"));
        productList.add(new Product(3,"Túi",30000,"Mới","Thiên Long"));
        productList.add(new Product(4,"Giấy A4",1000,"Mới","Thiên Long"));
    }
    @Override
    public List<Product> showProductList() {
        return productList;
    }

    @Override
    public void createProduct(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for(Product product:productList){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void edit(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void deleteProduct(Product product) {
        productList.remove(product);
    }
}
