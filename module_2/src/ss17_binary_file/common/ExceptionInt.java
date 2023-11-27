package ss17_binary_file.common;

import java.util.Scanner;

public class ExceptionInt {
    private static final Scanner sc = new Scanner(System.in);

    public static int checkParseInteger() {
        int value;
        while (true) {
            try {
                value = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Not a Integer number, please input again:");
            }
        }
        return value;
    }
}
