package case_study.views;

import case_study.utils.ExceptionInteger;

public class MainResort {
    private static ResortManagement resortManagement = new ResortManagement();

    public static void main(String[] args) {
        int choice;
        do {
            displayMainMenu();
            System.out.print("Let's choice: ");
            choice = ExceptionInteger.checkIntegerNumber();
            switch (choice) {
                case 1:
                    resortManagement.displayList();
                    break;
                case 2:
                    resortManagement.customer();
                    break;
                case 3:
                    resortManagement.facility();
                    break;
                case 4:
                    resortManagement.booking();
                    break;
                case 5:
                    resortManagement.promotion();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please input the number in list!!");
            }
        } while (true);

    }

    public static void displayMainMenu() {
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management \n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit\n");
    }
}
