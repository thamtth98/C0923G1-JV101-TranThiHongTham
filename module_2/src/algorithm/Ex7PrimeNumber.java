package algorithm;

import case_study.utils.exception.ExceptionInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex7PrimeNumber {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        System.out.println("Input the height of matrix: ");
        Scanner scanner = new Scanner(System.in);
        int height = ExceptionInteger.checkIntegerNumber();
        System.out.println("Input the width of matrix: ");
        int width = ExceptionInteger.checkIntegerNumber();
        int[][] numberList = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("Input the element in %d in line %d: ", j + 1, i + 1);
                numberList[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (checkPrime(numberList[i][j]) && !result.contains(numberList[i][j])) {
                    result.add(numberList[i][j]);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }

    public static boolean checkPrime(Integer number) {
        boolean flag = true;
        if (number <= 0 || number < 2) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;

    }
}