package ss13_searching_algorithrms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (right + left) / 2;
        if (right >= left) {
            if (arr[middle] == value) {
                return middle;
            }
            if (arr[middle] > value) {
                return binarySearch(arr, left, middle - 1, value);
            }
            if (arr[middle] < value) {
                return binarySearch(arr, middle + 1, right, value);
            }
        }
        return -1;
    }

    public static int[] sortArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 6, 3, 13, 5, 9};
        System.out.println(Arrays.toString(sortArr(arr)));
        System.out.print("Input the number: ");
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arr, 0, arr.length - 1, value));
    }


}
