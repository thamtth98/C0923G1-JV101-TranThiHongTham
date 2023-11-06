package ss1_introduction_to_java.practice.lesson1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        float width = scanner.nextInt();
        System.out.println("Nhập chiều dài");
        float height = scanner.nextInt();

        float area = width * height;
        System.out.println("Diện tích: " + area);
    }
}

