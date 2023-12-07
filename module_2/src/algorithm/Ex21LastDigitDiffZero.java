package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Ex21LastDigitDiffZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplication = 1;
        System.out.print("Input the number: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            multiplication *= i;
        }

        String[] str = String.valueOf(multiplication).split("");
        String result = "";
        for (int i = str.length - 1; i >= 0; i--) {
            if(!str[i].equals("0")){
                result = str[i];
                break;
            }
        }
        System.out.println(result);
    }
}
