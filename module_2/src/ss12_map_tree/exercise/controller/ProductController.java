package ss12_map_tree.exercise.controller;

import ss12_map_tree.exercise.model.Product;
import ss12_map_tree.exercise.service.IProductService;
import ss12_map_tree.exercise.service.ProductService;

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
        iProductService.remove();
    }
}
