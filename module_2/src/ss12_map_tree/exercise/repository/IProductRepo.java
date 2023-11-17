package ss12_map_tree.exercise.repository;

import ss12_map_tree.exercise.model.Product;

import java.util.List;

public interface IProductRepo {

    void add(Product product);

    List<Product> findAll();

    Product findByCode(Integer id);

    void remove(Integer id);
}
