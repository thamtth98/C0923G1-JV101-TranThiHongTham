package case_study.views;

import case_study.controllers.EmployeeController;
import case_study.models.person.Employee;
import case_study.services.IEmployeeService;
import case_study.services.impl.EmployeeService;
import case_study.utils.WriteEmployee;
import case_study.utils.exception.ExceptionInteger;
import case_study.utils.exception.ExceptionLong;
import case_study.utils.regex.Regex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeManagement {
    private static EmployeeController employeeController = new EmployeeController();
    private static int number;
    private static Scanner scanner = new Scanner(System.in);

    private static List<Employee> employeeList = new ArrayList<>();

    public void displayList() {
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Delete employee\n" +
                    "5. Search by name employee\n" +
                    "6. Return main menu\n");
            System.out.print("Let's choice: ");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    employeeList = employeeController.displayEmployee();
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    Employee employee = showInformation();
                    employeeController.addEmployee(employee);
                    System.out.println("Added!");
                    break;
                case 3:
                    System.out.print("Input the ID Staff: ");
                    String idStaff = scanner.nextLine();
                    employee = employeeController.findIdStaff(idStaff);
                    if (employee != null) {
                        System.out.println("The information employee you want edit: " + employee);
                        System.out.print("Please input 'y' to confirm edit: ");
                        String choice = scanner.nextLine();
                        if (choice.toLowerCase().equals("y".toLowerCase())) {
                            System.out.println("1. Edit the name \n" +
                                    "2. Edit the date of birth \n" +
                                    "3. Edit the gender \n" +
                                    "4. Edit the ID number \n" +
                                    "5. Edit the phone number \n" +
                                    "6. Edit the email \n" +
                                    "7. Edit the level \n" +
                                    "8. Edit the position \n" +
                                    "9. Edit the salary");
                            System.out.print("Let's choice: ");
                            int number = Integer.parseInt(scanner.nextLine());
                            switch (number) {
                                case 1:
                                    System.out.print("Input the new name: ");
                                    String name = scanner.nextLine();
                                    employeeController.editName(employee, name);
                                    System.out.println("Edit success!");
                                    break;
                                case 2:
                                    System.out.print("Input the new date of birth: ");
                                    LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
                                    employeeController.editDateOfBirth(employee, dateOfBirth);
                                    System.out.println("Edit success!");
                                    break;
                                case 3:
                                    String gender = gender();
                                    employeeController.editGender(employee, gender);
                                    System.out.println("Edit success!");
                                    break;
                                case 4:
                                    System.out.print("Input the new ID number: ");
                                    String idNumber = scanner.nextLine();
                                    employeeController.editIdNumber(employee, idNumber);
                                    System.out.println("Edit success!");
                                    break;
                                case 5:
                                    System.out.print("Input the new phone number: ");
                                    String phoneNumber = scanner.nextLine();
                                    employeeController.editPhoneNumber(employee, phoneNumber);
                                    System.out.println("Edit success!");
                                    break;
                                case 6:
                                    System.out.print("Input the new email: ");
                                    String email = scanner.nextLine();
                                    employeeController.editEmail(employee, email);
                                    System.out.println("Edit success!");
                                    break;
                                case 7:
                                    String level = level();
                                    employeeController.editLevel(employee, level);
                                    System.out.println("Edit success!");
                                    break;
                                case 8:
                                    String position = position();
                                    employeeController.editPosition(employee, position);
                                    System.out.println("Edit success!");
                                    break;
                                case 9:
                                    System.out.print("Input the new salary: ");
                                    Long salary = Long.parseLong(scanner.nextLine());
                                    employeeController.editSalary(employee, salary);
                                    System.out.println("Edit success!");
                                    break;
                            }
                        } else {
                            System.out.println("NOT edit!");
                        }
                    } else {
                        System.out.println("NOT found the ID!");
                    }
                    break;
                case 4:
                    System.out.print("PLease input the ID staff you want delete: ");
                    idStaff = scanner.nextLine();
                    employee = employeeController.findIdStaff(idStaff);
                    System.out.println("The information you want delete: " + employee);
                    if (employee != null) {
                        System.out.print("Do you want delete, enter y to confirm: ");
                        String choice = scanner.nextLine();
                        if (choice.toLowerCase().equals("y".toLowerCase())) {
                            employeeController.deleteEmployee(employee);
                            System.out.println("Deleted!!!");
                        } else {
                            System.out.println("NOT delete!");
                        }
                    } else {
                        System.out.println("NOT found ID!");
                    }
                    break;
                case 5:
                    System.out.print("Input the name you want find: ");
                    String name = scanner.nextLine();
                    List<Employee> employeeByName = employeeController.findByName(name);
                    if (employeeByName.size() != 0) {
                        for (Employee employee1 : employeeByName) {
                            System.out.println("Find: " + employee1);
                        }
                    } else {
                        System.out.println("NOT found name!!");
                    }
                    break;
            }
        } while (true);
    }

    public static Employee showInformation() {
        String idStaff = Regex.checkIDStaff();
        String name = Regex.checkName();

        String dateOfBirthStr = Regex.checkDateOfBirth();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
        boolean checkAge = Regex.checkAge(dateOfBirthStr);
        while (!checkAge) {
            System.out.println("Invalid age!, input again: ");
            dateOfBirthStr = Regex.checkDateOfBirth();
            dateOfBirth = LocalDate.parse(dateOfBirthStr);
            checkAge = Regex.checkAge(dateOfBirthStr);
        }

        String gender = gender();

        String idNumber = Regex.checkIDNumber();

        String phoneNumber = Regex.checkPhoneNumber();

        System.out.println("Input the email: ");
        String email = scanner.nextLine();

        String level = level();

        String position = position();
        System.out.println("Input the salary: ");
        long salary = ExceptionLong.checkLongNumber();
        while (salary <= 0) {
            System.out.println("Salary cannot be negative, input again: ");
            salary = ExceptionLong.checkLongNumber();
        }
        return new Employee(idStaff, name, dateOfBirth, gender, idNumber, phoneNumber, email, level, position, salary);
    }

    public static String gender() {
        do {
            System.out.println("Choice the gender: \n" +
                    "1. Male \n" +
                    "2. Female");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    return "Male";
                case 2:
                    return "Female";
                default:
                    System.out.println("Please input the number in list: ");
                    break;
            }
        } while (true);
    }


    public static String level() {
        System.out.println("1. Intermediate \n" +
                "2. College\n" +
                "3. University \n" +
                "4. Postgraduate");
        System.out.print("Choice the new level: ");
        number = Integer.parseInt(scanner.nextLine());
        String level = "";
        switch (number) {
            case 1:
                level = "Intermediate";
                break;
            case 2:
                level = "College";
                break;
            case 3:
                level = "University";
                break;
            case 4:
                level = "Postgraduate";
                break;
        }
        return level;
    }

    public static String position() {
        System.out.println("1. Receptionist \n" +
                "2. Server\n" +
                "3. Specialist\n" +
                "4. Supervisor\n" +
                "5. Manager\n" +
                "6. Director");
        System.out.print("Choice the new level: ");
        number = Integer.parseInt(scanner.nextLine());
        String position = "";
        switch (number) {
            case 1:
                position = "Receptionist";
                break;
            case 2:
                position = "Server";
                break;
            case 3:
                position = "Specialist";
                break;
            case 4:
                position = "Supervisor";
                break;
            case 5:
                position = "Manager";
                break;
            case 6:
                position = "Director";
                break;
            default:
                System.out.println("Please choice the number in the list!");
                break;
        }
        return position;
    }

}
