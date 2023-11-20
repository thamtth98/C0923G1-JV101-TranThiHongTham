package ss12_map_tree.exercise.views;

import ss12_map_tree.exercise.controllers.ProductController;
import ss12_map_tree.exercise.models.Product;

import java.util.List;
import java.util.Scanner;

import static ss8_MVC.example.LoginView.scanner;

public class ProductMenu {
    private static ProductController productController = new ProductController();

    public void menuProduct() {
        int choice;
        List<Product> products;
        Integer id;
        Product product;
        Product productRemove;
        do {
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Delete product");
            System.out.println("4. Show the list product");
            System.out.println("5. Find product");
            System.out.println("6. Sort product");
            System.out.println("7. Exit the choice");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            choice = Integer.parseInt(scanner.nextLine());
            product = inputInfoProduct();
            switch (choice) {
                case 1:
                    product = inputInfoProduct();
                    productController.addProduct(product);
                    System.out.println("Added!");
                    break;
//                case 2:
//                    productController.addProduct(product);
//                    System.out.println("Added!");
//                    break;
                case 3:
                    System.out.print("Input the id you want delete:");
                    id = Integer.parseInt(scanner.nextLine());
                    productRemove = productController.findCode(id);
                    if (productRemove == null) {
                        System.out.println("Not found ID");
                    } else {
                        System.out.println("Found information: " + productRemove);
                        System.out.println("You sure delete, please enter y to confirm!");
                        String confirm = scanner.nextLine();
                        if (confirm.equals("y")) {
                            productController.remove(id);
                            System.out.println("Deleted!");
                        }
                    }
                    break;
                case 4:
                   products = productController.findAll();
                    for (Product item : products) {
                        System.out.println(item);
                    }
                    break;
                case 7:
                    return;
            }
        } while (choice != 8);
    }

    private Product inputInfoProduct() {
        System.out.print("Input the ID: ");
        Integer id = Integer.valueOf(scanner.nextLine());
        System.out.print("Input the name product: ");
        String name = scanner.nextLine();
        System.out.print("Input the price: ");
        Integer price = Integer.valueOf(scanner.nextLine());
        System.out.print("Input quality: ");
        Integer quality = Integer.valueOf(scanner.nextLine());
        return new Product(id, name, price, quality);
    }
}
