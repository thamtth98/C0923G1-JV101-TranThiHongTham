package ss17_binary_file.views;

import ss17_binary_file.common.ExceptionDouble;
import ss17_binary_file.controllers.MotorController;
import ss17_binary_file.models.Motorbike;

import java.util.List;
import java.util.Scanner;

public class MotorManagement {
    private Motorbike motorbike = new Motorbike();
    private MotorController motorController = new MotorController();

    public void addMotor(Motorbike motorbike) {
        motorController.addMotor(motorbike);

    }

    public List<Motorbike> showList() {
        return motorController.showList();
    }

    public Motorbike infoMotor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. ID of Motorbike: ");
        String id = scanner.nextLine();
        System.out.println("2. The name of motorbike: ");
        String name = scanner.nextLine();
        System.out.println("3. Price of motorbike: ");
        double price = ExceptionDouble.checkParseDouble();
        System.out.println("4. Manufacture of motorbike: ");
        String manufacture = scanner.nextLine();
        System.out.println("5. Describe: ");
        String describe = scanner.nextLine();
        motorbike = new Motorbike(id, name, price, manufacture, describe);

        return motorbike;
    }


    public Motorbike findMotor(String id) {
        return motorController.findMotor(id);
    }
}
