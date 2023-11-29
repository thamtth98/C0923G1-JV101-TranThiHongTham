package case_study.views;

import case_study.repository.IEmployeeRepository;
import case_study.repository.impl.EmployeeRepository;
import case_study.services.IEmployeeService;
import case_study.services.IFacilityService;
import case_study.services.impl.EmployeeService;
import case_study.services.impl.FacilityService;
import case_study.utils.ExceptionInteger;

public class ResortManagement {
    private static IFacilityService iFacilityService = new FacilityService();
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static int number;
    public void displayList() {
        System.out.println("1. Display list employees\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Delete employee\n" +
                "5. Search by name employee\n" +
                "6. Return main menu\n");
        number = ExceptionInteger.checkIntegerNumber();
        switch (number){
            case 1:
                iEmployeeService.displayEmployee();
                break;
        }

    }

    public void customer() {
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Delete customer\n" +
                "5. Search by name customer\n" +
                "6. Return main menu\n");
        number = ExceptionInteger.checkIntegerNumber();

    }

    public void facility() {
        System.out.println("1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. Display list facility maintenance\n" +
                "4. Delete facility\n" +
                "5. Return main menu\n");
        number = ExceptionInteger.checkIntegerNumber();

    }

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
