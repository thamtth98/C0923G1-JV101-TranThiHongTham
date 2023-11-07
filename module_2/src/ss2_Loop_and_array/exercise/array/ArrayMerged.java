package ss2_Loop_and_array.exercise.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of first array: ");
        int lengthFirst = scanner.nextInt();
        int[] firstArray = new int[lengthFirst];

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Input the element of the first array:");
            System.out.println("Enter element " + i);
            firstArray[i] = scanner.nextInt();
        }

        System.out.println("Input the length of second array: ");
        int lengthSecond = scanner.nextInt();
        int[] secondArr = new int[lengthSecond];

        for (int i = 0; i < secondArr.length; i++) {
            System.out.println("Input the element of the second array:");
            System.out.println("Enter element " + i);
            secondArr[i] = scanner.nextInt();
        }
        int[] arrTotal = new int[lengthFirst + lengthSecond];
        for (int i = 0; i < firstArray.length; i++) {
                    arrTotal[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < arrTotal.length; i++) {
                    arrTotal[i] = secondArr[i - firstArray.length];
        }
        System.out.println("Array merged is:");
        System.out.println(Arrays.toString(arrTotal));
    }
}

