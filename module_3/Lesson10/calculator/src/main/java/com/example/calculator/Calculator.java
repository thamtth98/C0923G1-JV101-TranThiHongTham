package com.example.calculator;

public class Calculator {

    public static double calculate(double firstNumber, double secondNumber, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
            case '-':
                result = firstNumber - secondNumber;
            case '*':
                result = firstNumber * secondNumber;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    throw new ArithmeticException("Can't divide by zero!");
                }
            default:
                System.out.println("Invalid operation!!!");
        }
        return result;
    }
}
