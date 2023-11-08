package ss3_method.exercise;

import java.util.Scanner;

public class SumOfColumn {
    public static float sumColumn(float[][] arr) {
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the column you want to calculate sum: ");
        int index = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][index];
        }
        return sum;
    }

    public static void main(String[] args) {
        float[][] arr = SumOfDiagonal.createMatrix();
        System.out.println("Sum of column is: " + sumColumn(arr));
    }
}

