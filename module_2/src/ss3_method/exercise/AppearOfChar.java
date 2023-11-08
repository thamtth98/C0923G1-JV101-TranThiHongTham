package ss3_method.exercise;

import java.util.Scanner;

public class AppearOfChar {
    public static int count(String str,char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = scanner.nextLine();
        System.out.println("Input the character you want to count in the string:");
        String character = scanner.nextLine();
        System.out.println(count(str,character.charAt(0)));
    }
}
