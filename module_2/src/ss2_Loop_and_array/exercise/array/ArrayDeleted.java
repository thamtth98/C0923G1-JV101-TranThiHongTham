package ss2_Loop_and_array.exercise.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleted {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input the number you want to delete");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int j = index; j < array.length - 1; j++) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
            array[array.length - 1] = 0;
            System.out.printf("Deleted array: %d \n", number);
            System.out.println(Arrays.toString(array));

        } else {
            System.out.printf("Not found %d in array", number);

        }


    }
}
