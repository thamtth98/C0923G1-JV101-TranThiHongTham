package com.example.shopcart.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Book, Integer> products = new HashMap<>();

    public Cart(Map<Book, Integer> products) {
        this.products = products;
    }

    public Cart() {
    }

    public Map<Book, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Book, Integer> products) {
        this.products = products;
    }
}
