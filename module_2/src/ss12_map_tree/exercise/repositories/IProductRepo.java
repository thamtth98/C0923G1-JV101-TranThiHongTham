package ss12_map_tree.exercise.repositories;

import ss12_map_tree.exercise.models.Product;

import java.util.List;

public interface IProductRepo {

    void add(Product product);

    List<Product> findAll();

    Product findByCode(Integer id);

    void remove(Integer id);

    void editName(String name, Product product);

    void editPrice(int price, Product product);

    void editQuality(int quality, Product product);

    List<Product> findProduct(Integer id);
}
