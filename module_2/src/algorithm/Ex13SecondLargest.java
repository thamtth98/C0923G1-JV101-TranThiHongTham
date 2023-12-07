package algorithm;

import java.util.*;

public class Ex13SecondLargest {
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
        List<Integer> arrCopy = new ArrayList<>(arr);
        Collections.sort(arrCopy);
        System.out.println(arr.indexOf(arrCopy.get(arrCopy.size()-2)));
    }
}
