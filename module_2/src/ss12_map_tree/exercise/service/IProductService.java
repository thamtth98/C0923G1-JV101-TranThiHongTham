package ss12_map_tree.exercise.service;

import ss12_map_tree.exercise.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    List<Product> findAll();

    Product findByCode(Integer id);

    void remove();

    void remove(Integer id);
}
