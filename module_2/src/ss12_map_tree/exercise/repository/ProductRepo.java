package ss12_map_tree.exercise.repository;

import ss12_map_tree.exercise.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private static List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findByCode(Integer id) {
        for (Product item: products) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

    @Override
    public void remove(Integer id) {
        for (Product item: products) {
            if(item.getId().equals(id)){
               products.remove(item);
               break;
            }
        }
    }

}
