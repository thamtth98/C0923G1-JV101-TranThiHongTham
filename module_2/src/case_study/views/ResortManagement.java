package case_study.views;

import case_study.services.IEmployeeService;
import case_study.services.IFacilityService;
import case_study.services.impl.EmployeeService;
import case_study.services.impl.FacilityService;
import case_study.utils.exception.ExceptionInteger;

import java.util.Scanner;

public class ResortManagement {
    private static IFacilityService iFacilityService = new FacilityService();
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static int number;
    private static Scanner scanner = new Scanner(System.in);


    public void booking() {
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu\n");
    }

    public void promotion() {
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu\n");
    }
}
