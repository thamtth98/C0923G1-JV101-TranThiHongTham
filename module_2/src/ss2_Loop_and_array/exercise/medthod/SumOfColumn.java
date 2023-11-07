package ss2_Loop_and_array.exercise.medthod;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the elements in 2D array: ");
        int lengthArray = scanner.nextInt();
        System.out.println("Input the elements in each array: ");
        int lengthEachArray = scanner.nextInt();
        float[][] arr = new float[lengthArray][lengthEachArray];
        float number;
        for (int i = 0; i < lengthArray; i++) {
            for (int j = 0; j < lengthEachArray; j++) {
                System.out.printf("Input the value of array in [%d][%d]: ", i, j);
                number = scanner.nextFloat();
                arr[i][j] = number;
            }
        }
        System.out.println("Sum of column is: " + sumColumn(arr));
    }
}

