package ss12_map_tree.exercise.repositories;

import ss12_map_tree.exercise.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    private static List<Product> products = new ArrayList<>();
    static {
        Product product1 = new Product(1,"Iphone 11",17000,12);
        Product product2 = new Product(2,"Iphone 11 pro max",19000,15);
        products.add(product1);
        products.add(product2);
    }

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
