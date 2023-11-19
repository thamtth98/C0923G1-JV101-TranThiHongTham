package ss12_map_tree.exercise.views;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductMenu productMenu = new ProductMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Just start managing products!!");
        String choice;
        System.out.print("Let's enter E to start!!");
        choice = scanner.nextLine();
        if(choice.toLowerCase().equals("e")){
            productMenu.menuProduct();
        }else {
            System.out.println("Exit");
        }
    }
}
