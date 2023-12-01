package case_study.utils.exception;

import java.util.Scanner;

public class ExceptionLong {
    private static Scanner scanner = new Scanner(System.in);
    public static long checkLongNumber(){
        long number;
        while (true){
            try {
                number = Long.parseLong(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Number is NOT in correct format, please input again: ");
            }
        }
        return number;
    }
}
