package ss12_map_tree.exercise.services;

import ss12_map_tree.exercise.models.Product;
import ss12_map_tree.exercise.repositories.IProductRepo;
import ss12_map_tree.exercise.repositories.ProductRepo;

import java.util.List;


public class ProductService implements IProductService{
    private IProductRepo iProductRepo = new ProductRepo();

    @Override
    public void add(Product product) {
        iProductRepo.add(product);
    }

    @Override
    public List<Product> findAll() {
       return iProductRepo.findAll();
    }

    @Override
    public Product findByCode(Integer id) {
        return iProductRepo.findByCode(id);
    }

    @Override
    public void remove() {

    }
    @Override
    public void remove(Integer id) {
        iProductRepo.remove(id);
    }
}
