package ss15_exception_debug.exercise;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the first edge: ");
            double firstEdge = Double.parseDouble(scanner.nextLine());
            System.out.println("Input the second edge: ");
            double secondEdge = Double.parseDouble(scanner.nextLine());
            System.out.println("Input the third edge: ");
            double thirdEdge = Double.parseDouble(scanner.nextLine());
            handleException(firstEdge, secondEdge, thirdEdge);
            System.out.println("This is a edge of triangle!");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("This is NOT a number");
        }

    }

    public static void handleException(double firstEdge, double secondEdge, double thirdEdge) throws IllegalTriangleException {
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
            throw new IllegalTriangleException("The sides of a triangle CANNOT be negative");
        } else if (firstEdge + secondEdge <= thirdEdge || secondEdge + thirdEdge <= firstEdge || thirdEdge + firstEdge <= secondEdge) {
            throw new IllegalTriangleException("This is NOT a edge of triangle!");
        }
    }

}
