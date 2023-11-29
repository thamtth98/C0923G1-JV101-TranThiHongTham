package case_study.utils;

import java.util.Scanner;

public class ExceptionInteger {
    private static Scanner scanner = new Scanner(System.in);
    public static int checkIntegerNumber(){
        int number;
        while (true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Not a choice, please input again: ");
            }
        }
        return number;
    }
}
