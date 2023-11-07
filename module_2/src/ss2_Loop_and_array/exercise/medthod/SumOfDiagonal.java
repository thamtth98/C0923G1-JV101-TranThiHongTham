package ss2_Loop_and_array.exercise.medthod;

import java.util.Scanner;

public class SumOfDiagonal {
    public static float sumOfDiagonal (float[][] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the elements in 2D array = in each array: ");
        int length2DArray = scanner.nextInt();
        float[][] maxtric = new float[length2DArray][length2DArray];
        float number;
        for (int i = 0; i < length2DArray; i++) {
            for (int j = 0; j < length2DArray; j++) {
                System.out.printf("Input the value of array in [%d][%d]", i, j);
                number = scanner.nextFloat();
                maxtric[i][j] = number;
            }
        }
        System.out.println(sumOfDiagonal(maxtric));
    }
}
