package ss12_map_tree.exercise.repositories;

import ss12_map_tree.exercise.models.Product;

import java.util.List;

public interface IProductRepo {

    void add(Product product);

    List<Product> findAll();

    Product findByCode(Integer id);

    void remove(Integer id);
}
