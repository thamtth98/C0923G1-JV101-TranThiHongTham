package case_study.views;

import case_study.controllers.FacilityController;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.utils.exception.ExceptionInteger;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityManagement {
    private static FacilityController facilityController = new FacilityController();
    private static int number;
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility,Integer> facilityList = new LinkedHashMap<>();
    public void facility() {
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Delete facility\n" +
                    "5. Return main menu\n");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number){
                case 1:
                    facilityList = facilityController.display();
                    for(Map.Entry<Facility, Integer> temp: facilityList.entrySet()){
                        System.out.println(temp);
                    }
                    break;
                case 2:
                    menuAdd();
                    break;
                case 3:
                    facilityList = facilityController.listMaintenance();
                    for(Map.Entry<Facility, Integer> temp: facilityList.entrySet()){
                        System.out.println(temp);
                    }
                    break;
                case 4:
                    System.out.println("Input the ID: ");
                    String idService = scanner.nextLine();
                    Facility facility = facilityController.findIdService(idService);
                    if(facility !=null){

                    }
                    break;
            }
        }while (true);

    }
    public static void menuAdd(){
        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number){
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
            }
        }while (true);
    }

    private static Room infoRoom() {
        //String idService, String name, Double area, Double rentalCosts,
        // Integer numberOfPeople, String typeDate, String freeService
        System.out.println("Input idService");
        String idService = scanner.nextLine();

        System.out.println("Input name");
        String name = scanner.nextLine();

        System.out.println("Input area");
        Double area = Double.parseDouble(scanner.nextLine());

        System.out.println("Input rentalCosts");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());

        System.out.println("Input numberOfPeople");
        Integer numberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Input typeDate");
        String typeDate = scanner.nextLine();
        System.out.println("Input freeService");
        String freeService = scanner.nextLine();
        return new Room(idService,name,area,rentalCosts,numberOfPeople,typeDate,freeService);
    }

    private static House infoHouse() {
        //String idService, String name, Double area, Double rentalCosts,
        // Integer numberOfPeople, String typeDate, String roomHouse, Integer numberOfFloorHouse
        System.out.println("Input idService");
        String idService = scanner.nextLine();

        System.out.println("Input name");
        String name = scanner.nextLine();

        System.out.println("Input area");
        Double area = Double.parseDouble(scanner.nextLine());

        System.out.println("Input rentalCosts");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());

        System.out.println("Input numberOfPeople");
        Integer numberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Input typeDate");
        String typeDate = scanner.nextLine();

        System.out.println("Input roomHouse");
        String roomHouse = scanner.nextLine();


        System.out.println("Input numberOfFloor");
        Integer numberOfFloor = Integer.parseInt(scanner.nextLine());

        return new House(idService,name,area,rentalCosts,numberOfPeople,typeDate,roomHouse,numberOfFloor);
    }

    private static Villa infoVilla() {
        //String idService, String name, Double area, Double rentalCosts,
        // Integer numberOfPeople, String typeDate, String roomStandards, Double areaPool, Integer numberOfFloor
        System.out.println("Input idService");
        String idService = scanner.nextLine();

        System.out.println("Input name");
        String name = scanner.nextLine();

        System.out.println("Input area");
        Double area = Double.parseDouble(scanner.nextLine());

        System.out.println("Input rentalCosts");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());

        System.out.println("Input numberOfPeople");
        Integer numberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Input typeDate");
        String typeDate = scanner.nextLine();

        System.out.println("Input roomStandards");
        String roomStandards = scanner.nextLine();

        System.out.println("Input areaPool");
        Double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Input numberOfFloor");
        Integer numberOfFloor = Integer.parseInt(scanner.nextLine());
        return new Villa(idService,name,area,rentalCosts,numberOfPeople,typeDate,roomStandards,areaPool,numberOfFloor);
    }

}
