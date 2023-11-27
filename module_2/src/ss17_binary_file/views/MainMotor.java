package ss17_binary_file.views;

import ss12_map_tree.exercise.models.Product;
import ss17_binary_file.common.ExceptionInt;
import ss17_binary_file.models.Motorbike;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMotor {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike();
        MotorManagement motorManagement = new MotorManagement();
        int choice;
        String id;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add the motorbike \n" +
                            "2. Show list motorbike \n" +
                            "3. Find the motorbike \n" +
                            "Let's choice: ");
            choice = ExceptionInt.checkParseInteger();
            switch (choice){
                case 1:
                    motorbike = motorManagement.infoMotor();
                    motorManagement.addMotor(motorbike);
                    System.out.println("Added!!!");
                    break;
                case 2:
                    System.out.println(motorManagement.showList());
                    break;
                case 3:
                    System.out.println("Input the ID you want find: ");
                    id = scanner.nextLine();
                    motorbike = motorManagement.findMotor(id);
                    System.out.println("Found: "+motorbike);
                    break;
            }
        } while (true);


    }
}
