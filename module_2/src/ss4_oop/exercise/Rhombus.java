package ss4_oop.exercise;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last (number+1) you want to print to the screen: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2 * number; j++) {
                if (i == 0) {
                    System.out.print("");
                } else if (j == number - 1 - i || j == number + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = number - 2; i > 0; i--) {
            for (int j = 0; j < 2 * number + 1; j++) {
                if (j == number - 1 - i || j == number + i) {
                    System.out.print(i);
                } else if (i == number - 1 && j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}