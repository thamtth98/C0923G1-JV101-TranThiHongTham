package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex16PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i <size; i++){
            System.out.printf("Input the element %d: ",i+1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        List<Integer> prefixSums = new ArrayList<>();
        prefixSums.add(arr[0]);
        for(int i = 1; i < arr.length;i++){
            sum = 0;
            for (int j = 0; j <= i; j++){
                sum += arr[j];
            }
            prefixSums.add(sum);
        }
        System.out.println(prefixSums);
    }
}
