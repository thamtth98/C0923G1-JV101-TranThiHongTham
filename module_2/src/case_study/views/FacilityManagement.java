package case_study.views;

import case_study.controllers.FacilityController;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.utils.exception.ExceptionInteger;
import case_study.utils.regex.Regex;
import ss17_binary_file.common.ExceptionDouble;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityManagement {
    private static FacilityController facilityController = new FacilityController();
    private static int number;
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    public void facility() {
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Delete facility\n" +
                    "5. Return main menu\n");
            System.out.println("Let's choice: ");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    facilityList = facilityController.display();
                    for (Map.Entry<Facility, Integer> temp : facilityList.entrySet()) {
                        System.out.println(temp);
                    }
                    break;
                case 2:
                    menuAdd();
                    break;
                case 3:
                    facilityList = facilityController.listMaintenance();
                    for (Map.Entry<Facility, Integer> temp : facilityList.entrySet()) {
                        System.out.println(temp);
                    }
                    break;
                case 4:
                    System.out.println("Input the ID: ");
                    String idService = scanner.nextLine();
                    Facility facility = facilityController.findIdService(idService);
                    if (facility != null) {
                        System.out.println("Find: " + facility);
                        System.out.println("Do you want delete? enter y to confirm: ");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("y")) {
                            facilityController.delFacility(facility);
                            System.out.println("Deleted!");
                        } else {
                            System.out.println("NOT delete!");
                        }
                    } else {
                        System.out.println("Not found ID!");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please choice number in the list!");
            }
        } while (true);

    }

    public static void menuAdd() {
        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n");
            System.out.println("Let's choice: ");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    Villa villa = infoVilla();
                    facilityController.addVilla(villa);
                    System.out.println("Added!");
                    break;
                case 2:
                    House house = infoHouse();
                    facilityController.addHouse(house);
                    System.out.println("Added!");
                    break;
                case 3:
                    Room room = infoRoom();
                    facilityController.addRoom(room);
                    System.out.println("Added!");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please choice number in the list!");
            }
        } while (true);
    }

    private static String rentalType() {
        do {
            System.out.println("1. By year \n" +
                    "2. By month\n" +
                    "3. By day");
            System.out.print("Choice the type rental: ");
            int number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    return "By year";
                case 2:
                    return "By month";
                case 3:
                    return "By day";
                default:
                    System.out.println("Please choice the number in the list!");
            }
        } while (true);
    }

    public static double inputArea() {
        System.out.println("Input area (m2): ");
        double area = ExceptionDouble.checkParseDouble();
        while (area <= 30) {
            System.out.println("The area must be greater than 30 m2, input again: ");
            area = ExceptionDouble.checkParseDouble();
        }
        return area;
    }

    public static double inputRentalCosts() {
        double rentalCosts = ExceptionDouble.checkParseDouble();
        while (rentalCosts <= 0) {
            System.out.println("The area must be positive number, input again: ");
            rentalCosts = ExceptionDouble.checkParseDouble();
        }
        return rentalCosts;
    }

    public static int inputNumberOfPeople() {
        System.out.println("Let's input people: ");
        int numberOfPeople = ExceptionInteger.checkIntegerNumber();
        while (numberOfPeople < 0 || numberOfPeople >= 20) {
            System.out.println("Maximum number of people must be >0 and less than <20, input again: ");
            numberOfPeople = ExceptionInteger.checkIntegerNumber();
        }
        return numberOfPeople;
    }

    private static House infoHouse() {

        String idService = Regex.checkIDHouse();

        String name = Regex.checkName();
        double area = inputArea();
        double rentalCosts = inputRentalCosts();

        int numberOfPeople = inputNumberOfPeople();

        String rentalType = rentalType();

        String roomHouse = Regex.checkName();

        System.out.println("Input numberOfFloor");
        int numberOfFloor = ExceptionInteger.checkIntegerNumber();
        while (numberOfFloor <= 0) {
            System.out.println("The number of floor must be positive number, input again: ");
            numberOfFloor = ExceptionInteger.checkIntegerNumber();
        }

        return new House(idService, name, area, rentalCosts, numberOfPeople, rentalType, roomHouse, numberOfFloor);
    }

    private static Room infoRoom() {

        String idService = Regex.checkIDRoom();

        String name = Regex.checkName();

        double area = inputArea();


        double rentalCosts = inputRentalCosts();


        int numberOfPeople = inputNumberOfPeople();

        String rentalType = rentalType();

        System.out.println("Input freeService");
        String freeService = scanner.nextLine();

        return new Room(idService, name, area, rentalCosts, numberOfPeople, rentalType, freeService);
    }

    private static Villa infoVilla() {
        //String idService, String name, Double area, Double rentalCosts,
        // Integer numberOfPeople, String rentalType, String roomStandards, Double areaPool, Integer numberOfFloor
        String idService = Regex.checkIDVilla();

        String name = Regex.checkName();

        double area = inputArea();


        double rentalCosts = inputRentalCosts();


        int numberOfPeople = inputNumberOfPeople();


        String rentalType = rentalType();

        System.out.println("Input roomStandards");
        String roomStandards = scanner.nextLine();

        System.out.println("Input area pool (m2): ");
        double areaPool = ExceptionDouble.checkParseDouble();
        while (areaPool <= 30) {
            System.out.println("The area must be greater than 30 m2, input again: ");
            areaPool = ExceptionDouble.checkParseDouble();
        }
        System.out.println("Let's input number of floor: ");
        int numberOfFloor = ExceptionInteger.checkIntegerNumber();
        while (numberOfFloor <= 0) {
            System.out.println("The number of floor must be positive number, input again: ");
            numberOfFloor = ExceptionInteger.checkIntegerNumber();
        }

        return new Villa(idService, name, area, rentalCosts, numberOfPeople, rentalType, roomStandards, areaPool, numberOfFloor);
    }

}
