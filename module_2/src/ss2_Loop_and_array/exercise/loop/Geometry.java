package ss2_Loop_and_array.exercise.loop;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle \n" +
                "2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right) \n" +
                "3. Print isosceles triangle \n" +
                "4. Exit \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one case");
        int number = scanner.nextInt();
        if (number > 0 && number < 4) {
            switch (number) {
                case 1:
                    System.out.println("Input the height: ");
                    int height = scanner.nextInt();

                    System.out.println("Input the width: ");
                    int width = scanner.nextInt();

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 2:
                    System.out.println("Input the square edge:");
                    int squareEdge = scanner.nextInt();

                    for (int i = 0; i < squareEdge; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------");
                    for (int i = 0; i < squareEdge; i++) {
                        for (int j = 0; j <= squareEdge - i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("--------------");
                    for (int i = squareEdge - 1; i >= 0; i--) {
                        for (int j = 0; j < squareEdge; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("--------------");
                    for (int i = squareEdge - 1; i >= 0; i--) {
                        for (int j = squareEdge - 1; j >= 0; j--) {
                            if (j <= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                case 3:
                    System.out.println("Input the height of isosceles triangle: ");
                    int heightIso = scanner.nextInt();
                    for (int i = 0; i < heightIso; i++) {
                        for (int j = 0; j < 2 * heightIso; j++) {
                            if (j >= heightIso - 1 - i && j <= heightIso - 1 + i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
            }
        } else if(number == 4){
            System.out.println("Exit point geometry!!");
        } else {
            System.out.println("Let's choose in the menu!!!");
        }
    }
}
