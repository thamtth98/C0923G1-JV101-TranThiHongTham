package ss3_method.exercise;

import java.util.Scanner;

public class SumOfDiagonal {
    public static float sumOfDiagonal(float[][] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static float[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the elements in 2D array = in each array: ");
        int length2DArray = scanner.nextInt();
        float[][] matrix = new float[length2DArray][length2DArray];
        float number;
        for (int i = 0; i < length2DArray; i++) {
            for (int j = 0; j < length2DArray; j++) {
                System.out.printf("Input the value of array in [%d][%d]", i, j);
                number = scanner.nextFloat();
                matrix[i][j] = number;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        float[][] matrix = createMatrix();
        System.out.println(sumOfDiagonal(matrix));
    }
}
