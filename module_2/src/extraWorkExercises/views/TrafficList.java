package extraWorkExercises.views;

import extraWorkExercises.controllers.TrafficController;
import extraWorkExercises.models.Car;
import extraWorkExercises.models.Motorbike;
import extraWorkExercises.models.Traffic;
import extraWorkExercises.models.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TrafficList {
    private TrafficController trafficController = new TrafficController();
    private Scanner scanner = new Scanner(System.in);

    public void addList() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("What's kind of you want add the traffic?");
            System.out.println("1. The truck");
            System.out.println("2. The car");
            System.out.println("3. The motorbike");
            System.out.println("4. Back the main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Traffic truck = infoTheTruck();
                    trafficController.addTheTruck(truck);
                    System.out.println("Added!");
                    break;
                case 2:
                    Traffic car = infoTheCar();
                    trafficController.addTheCar(car);
                    System.out.println("Added!");
                    break;
                case 3:
                    Traffic motorbike = infoTheMotorbike();
                    trafficController.addTheMotorbike(motorbike);
                    System.out.println("Added!");
                    break;
            }
        } while (choice != 4);
    }

    private Traffic infoTheTruck() {
        System.out.print("Input the controlPlate: ");
        String controlPlate = scanner.nextLine();
        String manufacturerName = manufacturerTruck();
        System.out.print("Input the yearOfManufacturer: ");
        String yearOfManufacturer = scanner.nextLine();
        System.out.print("Input owner: ");
        String owner = scanner.nextLine();
        System.out.print("Input tonnage: ");
        Double tonnage = Double.valueOf(scanner.nextLine());
        return new Truck(controlPlate, manufacturerName, yearOfManufacturer, owner, tonnage);
    }

    private Traffic infoTheCar() {
        System.out.print("Input the controlPlate: ");
        String controlPlate = scanner.nextLine();
        String manufacturerName = manufacturerCar();
        System.out.print("Input the yearOfManufacturer: ");
        String yearOfManufacturer = scanner.nextLine();
        System.out.print("Input owner: ");
        String owner = scanner.nextLine();
        System.out.print("Input numberSeats: ");
        Integer numberSeats = Integer.parseInt(scanner.nextLine());
        System.out.print("Input carType: ");
        String carType = scanner.nextLine();
        return new Car(controlPlate, manufacturerName, yearOfManufacturer, owner, numberSeats, carType);
    }

    private Traffic infoTheMotorbike() {
        System.out.print("Input the controlPlate: ");
        String controlPlate = scanner.nextLine();
        String manufacturerName = manufacturerMotor();
        System.out.print("Input the yearOfManufacturer: ");
        String yearOfManufacturer = scanner.nextLine();
        System.out.print("Input owner: ");
        String owner = scanner.nextLine();
        System.out.print("Input capacity: ");
        Double capacity = Double.valueOf(scanner.nextLine());
        return new Motorbike(controlPlate, manufacturerName, yearOfManufacturer, owner, capacity);
    }

    private String manufacturerMotor() {
        List<String> myManufacturer = new ArrayList<>();
        myManufacturer.add("1 - Yamaha - Japan");
        myManufacturer.add("2 - Honda - Japan");
        myManufacturer.add("3 - Suzuki - Japan");
        String manufacturerName = null;
        System.out.println(myManufacturer);
        System.out.print("Enter your number: ");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                manufacturerName = "1 - Yamaha - Japan";
                break;
            case 2:
                manufacturerName = "2 - Honda - Japan";
                break;
            case 3:
                manufacturerName = "3 - Suzuki - Japan";
                break;
        }
        return manufacturerName;
    }

    private String manufacturerCar() {
        List<String> myManufacturer = new ArrayList<>();
        myManufacturer.add("1 - Toyota - Japan");
        myManufacturer.add("2 - Ford - USA");
        myManufacturer.add("3 - Mercedes-Benz - Germany");
        myManufacturer.add("4 - BMW - Germany");
        myManufacturer.add("5 - Hyundai - Korea");
        String manufacturerName = null;
        System.out.println(myManufacturer);
        System.out.print("Enter your number: ");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                manufacturerName = "1 - Toyota - Japan";
                break;
            case 2:
                manufacturerName = "2 - Ford - USA";
                break;
            case 3:
                manufacturerName = "3 - Mercedes-Benz - Germany";
                break;
            case 4:
                manufacturerName = "4 - BMW - Germany";
                break;
            case 5:
                manufacturerName = "5 - Hyundai - Korea";
                break;
        }
        return manufacturerName;
    }

    private String manufacturerTruck() {
        List<String> myManufacturer = new ArrayList<>();
        myManufacturer.add("1 - Volvo Trucks - Sweden");
        myManufacturer.add("2 - Scania - Sweden");
        myManufacturer.add("3 - Mercedes-Benz - Germany");
        myManufacturer.add("4 - Kenworth - USA");
        myManufacturer.add("5 - Isuzu Trucks - Japan");
        myManufacturer.add("6 - JAC Motors - China");
        String manufacturerName = null;
        System.out.println(myManufacturer);
        System.out.print("Enter your number: ");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 1:
                manufacturerName = "1 - Volvo Trucks - Sweden";
                break;
            case 2:
                manufacturerName = "2 - Scania - Sweden";
                break;
            case 3:
                manufacturerName = "3 - Mercedes-Benz - Germany";
                break;
            case 4:
                manufacturerName = "4 - Kenworth - USA";
                break;
            case 5:
                manufacturerName = "5 - Isuzu Trucks - Japan";
                break;
            case 6:
                manufacturerName = "6 - JAC Motors - China";
                break;
        }
        return manufacturerName;
    }


}
