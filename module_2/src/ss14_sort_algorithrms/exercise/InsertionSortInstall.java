package ss14_sort_algorithrms.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortInstall {
    public static void insertionSort(int[] arr) {
        int index;
        int value;
        for (int i = 1; i < arr.length; i++) {
            index = i;
            value = arr[i];
            while (index > 0 && value < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = value;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập size mảng: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size - 1; i++){
            System.out.println("Nhập phần tử thứ "+ i+1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        insertionSort(arr);
    }
}
