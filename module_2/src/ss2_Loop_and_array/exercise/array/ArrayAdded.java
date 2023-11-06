package ss2_Loop_and_array.exercise.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdded {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] resultArray;
        resultArray = new int[array.length + 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the index you want add number");
        int index = scanner.nextInt();

        System.out.println("Input the number you want add array");
        int number = scanner.nextInt();

        for (int i = 0; i < index; i++) {
            resultArray[i] = array[i];
        }
        resultArray[index] = number;
        for (int j = index + 1; j < resultArray.length; j++) {
            resultArray[j] = array[j - 1];
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
