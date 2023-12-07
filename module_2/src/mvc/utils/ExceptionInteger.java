package mvc.utils;

import java.util.Scanner;

public class ExceptionInteger {
    private static Scanner scanner = new Scanner(System.in);
    public static int exceptionInt(){
        int number;
        do {
            try{
                number = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Không phải số, nhập lại: ");
            }
        }while (true);

        return number;
    }
}
