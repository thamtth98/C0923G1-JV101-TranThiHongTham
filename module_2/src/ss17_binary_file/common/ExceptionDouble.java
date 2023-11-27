package ss17_binary_file.common;

import java.util.Scanner;

public class ExceptionDouble {
    private static final Scanner sc = new Scanner(System.in);

    public static double checkParseDouble() {
        double value;
        while (true) {
            try {
                value = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Not a double number, please input again:");
            }
        }
        return value;
    }
}
