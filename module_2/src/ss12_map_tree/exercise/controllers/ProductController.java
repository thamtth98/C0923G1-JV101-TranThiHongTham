package ss12_map_tree.exercise.controllers;

import ss12_map_tree.exercise.models.Product;
import ss12_map_tree.exercise.services.IProductService;
import ss12_map_tree.exercise.services.ProductService;

import java.util.List;

public class ProductController {
    private IProductService iProductService = new ProductService();
    public void addProduct(Product product) {
        iProductService.add(product);
    }

    public List<Product> findAll() {
       return iProductService.findAll();
    }

    public Product findCode(Integer id) {
        return iProductService.findByCode(id);
    }

    public void remove(Integer id) {
        iProductService.remove(id);
    }
}
