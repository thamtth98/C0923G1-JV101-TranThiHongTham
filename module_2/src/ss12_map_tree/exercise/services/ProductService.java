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

    @Override
    public void editName(String name, Product product) {
        iProductRepo.editName(name, product);
    }

    @Override
    public void editPrice(int price, Product product) {
        iProductRepo.editPrice(price,product);
    }

    @Override
    public void editQuality(int quality, Product product) {
        iProductRepo.editQuality(quality,product);
    }

    @Override
    public List<Product> findProduct(Integer id) {
       return iProductRepo.findProduct(id);
    }
}
