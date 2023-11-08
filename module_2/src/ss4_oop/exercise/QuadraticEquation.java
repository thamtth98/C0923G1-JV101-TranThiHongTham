package ss4_oop.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(this.getDiscriminant()))) / (2 * a);
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(this.getDiscriminant()))) / (2 * a);
    }

    public static void main(String[] args) {
        System.out.println("Input the a, b, c in quadratic equation ax^2 + bx + c = 0:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number a: ");
        double numberA = scanner.nextDouble();
        System.out.println("Input the number b: ");
        double numberB = scanner.nextDouble();
        System.out.println("Input the number c: ");
        double numberC = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("The equation has 2 solutions: " + quadraticEquation.getRoot1() + ", " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has double solution: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
