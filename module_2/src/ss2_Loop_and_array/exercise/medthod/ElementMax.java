package ss2_Loop_and_array.exercise.medthod;

import java.util.Scanner;

public class ElementMax {
    public static float findMax(float[][] array) {
        float max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the elements in 2D array: ");
        int length2DArray = scanner.nextInt();
        System.out.println("Input the elements in each array: ");
        int lengthEachArray = scanner.nextInt();
        float[][] maxtric = new float[length2DArray][lengthEachArray];
        float number;
        for (int i = 0; i < length2DArray; i++) {
            for (int j = 0; j < lengthEachArray; j++) {
                System.out.printf("Input the value of array in [%d][%d]", i, j);
                number = scanner.nextFloat();
                maxtric[i][j] = number;
            }
        }
        System.out.println("The max in maxtric is:" + findMax(maxtric));
    }

}
