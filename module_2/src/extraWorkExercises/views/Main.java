package extraWorkExercises.views;

import extraWorkExercises.models.Traffic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TrafficList trafficList = new TrafficList();
        TrafficManagement trafficManagement = new TrafficManagement();

        int choice;
        int choiceShow;
        do {
            System.out.println("Traffic management program. Let's choice: ");
            System.out.println("1. Add");
            System.out.println("2. Show the list traffic");
            System.out.println("3. Delete");
            System.out.println("4. Search by control plate");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    trafficList.addList();
                    break;
                case 2:
                    do {
                        System.out.println("Which listing do you want to display?");
                        System.out.println("1. Show the truck list");
                        System.out.println("2. Show the car list");
                        System.out.println("3. Show the motorbike list");
                        System.out.println("4. Show the all list");
                        System.out.println("5. Back to the main menu");
                        choiceShow = Integer.parseInt(scanner.nextLine());
                        switch (choiceShow) {
                            case 1:
                                List<Traffic> truckList = trafficManagement.showTruckList();
                                for (Traffic item : truckList) {
                                    System.out.println(item);
                                }
                                break;
                            case 2:
                                List<Traffic> carList = trafficManagement.showCarList();
                                for (Traffic item : carList) {
                                    System.out.println(item);
                                }
                                break;
                            case 3:
                                List<Traffic> motorList = trafficManagement.showMotorList();
                                for (Traffic item : motorList) {
                                    System.out.println(item);
                                }
                                break;
                            case 4:
                                List<Traffic> traffics = trafficManagement.showAll();
                                for (Traffic item : traffics) {
                                    System.out.println(item);
                                }
                                break;
                        }
                    } while (choiceShow != 5);
                    break;
                case 3:
                    System.out.print("Enter the control plate you want to delete: ");
                    String controlPlate = scanner.nextLine();
                    Traffic trafficByControl = trafficManagement.findControlPlate(controlPlate);
                    if (trafficByControl != null) {
                        System.out.println("The information of traffic you choice:");
                        System.out.println(trafficByControl);
                        System.out.println("Confirm delete, enter y");
                        String confirm = scanner.nextLine();
                        if (confirm.equals("y")) {
                            trafficManagement.remove(controlPlate);
                            System.out.println("Deleted!!!");
                        } else {
                            System.out.println("Not delete!");
                        }
                    } else {
                        System.out.println("!!Not found the control plate in list");
                        Main.main(new String[]{});
                    }
                    break;
                case 4:
                    System.out.print("Enter the control plate you want to search: ");
                    controlPlate = scanner.nextLine();
                    List<Traffic> listSearch = trafficManagement.searchControlPlate(controlPlate);
                    if (listSearch.size() != 0) {
                        System.out.println("The information of traffic you search:");
                        for (Traffic item : listSearch) {
                            System.out.println(item);
                        }
                    } else{
                        System.out.println("!!!Not found this control plate");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (choice != 6);
    }
}
