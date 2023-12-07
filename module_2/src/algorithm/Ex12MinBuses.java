package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex12MinBuses {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int number;
        for (int i = 0; i < size; i++){
            System.out.printf("Input the element %d: ",i+1);
            number = Integer.parseInt(scanner.nextLine());
            arr.add(number);
        }

        for (int j = 0; j < arr.size() - 1; j++) {
            for (int k = j + 1; k < arr.size(); k++) {
                if (arr.get(j) + arr.get(k) == 4) {
                    arr.remove(arr.get(j));
                    break;
                }
            }
        }

        System.out.println("Min taxi is: "+arr.size());
    }
}
