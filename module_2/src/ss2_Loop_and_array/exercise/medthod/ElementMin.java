package ss2_Loop_and_array.exercise.medthod;

import java.util.Scanner;

public class ElementMin {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of array:");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Input the %d element: ",i);
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMin(arr));
    }
}
