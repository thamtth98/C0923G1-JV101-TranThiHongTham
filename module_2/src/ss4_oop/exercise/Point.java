package ss4_oop.exercise;

import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the height of isosceles triangle: ");
        int heightIso = scanner.nextInt();
        for (int i = 0; i < heightIso; i++) {
            for (int j = 0; j < 2 * heightIso; j++) {
                if (i == 0) {
                    System.out.print("");
                } else if (j == heightIso - 1 - i || j == heightIso + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = heightIso -1; i >= 0; i--) {
            for (int j = 0; j < 2 * heightIso + 1; j++) {
                if (i == 0) {
                    System.out.print("");
                } else if (j == heightIso - 1 - i || j == heightIso + i) {
                    System.out.print(i);
                } else if (i == heightIso - 1 && j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
