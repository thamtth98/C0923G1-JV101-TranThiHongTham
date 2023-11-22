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
        int price;
        int quality;

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
            switch (choice) {
                case 1:
                    product = inputInfoProduct();
                    productController.addProduct(product);
                    System.out.println("Added!");
                    break;
                case 2:
                    System.out.print("Input the id you want edit:");
                    id = Integer.parseInt(scanner.nextLine());
                    product = productController.findCode(id);
                    if (product == null) {
                        System.out.println("Not found ID");
                    } else {
                        System.out.println("Found information: " + product);
                        System.out.println("What you want edit: ");
                        System.out.println("1. Name \n" +
                                "2. Price\n" +
                                "3. Quality");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.print("Enter new name: ");
                                String name = scanner.nextLine();
                                productController.editName(name, product);
                                System.out.println("Edit success!");
                                break;
                            case 2:
                                System.out.println("Enter new price: ");
                                price = Integer.parseInt(scanner.nextLine());
                                productController.editPrice(price, product);
                                System.out.println("Edit success!");
                                break;
                            case 3:
                                System.out.println("Enter new quality: ");
                                quality = Integer.parseInt(scanner.nextLine());
                                productController.editQuality(quality, product);
                                break;
                        }
                    }
                    break;
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
                case 5:
                    System.out.println("Input the ID you want find: ");
                    id = Integer.parseInt(scanner.nextLine());
                    products = productController.findProduct(id);
                    for (Product item:products){
                        System.out.println("Found" + item);
                    }
                    break;
                case 6:

                case 7:
                    return;
                default:
                    System.out.println("Please choice number in list!");
            }
        } while (true);
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
