package ss1_introduction_to_java.practice.lesson1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất ax + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = scanner.nextDouble();
        System.out.println("Nhập b");
        double b = scanner.nextDouble();
        System.out.println("Nhập c");
        double c = scanner.nextDouble();
        double x = (c - b)/ a;
        System.out.println("Giá trị của x là: "+ x);
    }

}
