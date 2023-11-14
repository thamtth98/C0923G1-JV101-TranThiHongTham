package ss8_MVC.exercise.controller;

import ss8_MVC.exercise.service.StudentService;
import ss8_MVC.exercise.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private static StudentService service = new StudentServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("----Student Manager----");
            System.out.println("1. List");
            System.out.println("2. Add");
            System.out.println("3. Edit");
            System.out.println("9. Exit");
            System.out.print("Please input the number: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1:

                    break;
                case 2:
                    break;
            }
        } while (true);
    }
}
