package case_study.views;

import case_study.utils.exception.ExceptionInteger;

import java.util.Scanner;

public class BookingManagement {
    private static int number;
    private static Scanner scanner = new Scanner(System.in);


    public void booking() {
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number){
                case 1:

                    break;
            }
        }while (true);

    }
}
