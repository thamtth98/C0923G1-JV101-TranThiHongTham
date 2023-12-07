package case_study.views;

import case_study.controllers.EmployeeController;
import case_study.models.person.Employee;
import case_study.utils.exception.ExceptionInteger;
import case_study.utils.exception.ExceptionLong;
import case_study.utils.regex.Regex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    private static EmployeeController employeeController = new EmployeeController();
    private static int number;
    private static Scanner scanner = new Scanner(System.in);

    private static List<Employee> employeeList = new ArrayList<>();

    public void displayList() {
        String idStaff;
        String choice;
        int number;
        Employee employee;
        String name;
        LocalDate dateOfBirth;
        String gender;
        String idNumber;
        String phoneNumber;
        String email;
        String level;
        String position;
        Long salary;
        List<Employee> employeeByName;
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
                    employeeList = employeeController.display();
                    for (Employee employees : employeeList) {
                        System.out.println(employees);
                    }
                    break;
                case 2:
                    employee = showInformation();
                    employeeController.addEmployee(employee);
                    System.out.println("Added!");
                    break;
                case 3:
                    System.out.print("Input the ID Staff: ");
                    idStaff = scanner.nextLine();
                    employee = employeeController.findIdStaff(idStaff);
                    if (employee != null) {
                        System.out.println("The information employee you want edit: " + employee);
                        System.out.print("Please input 'y' to confirm edit: ");
                        choice = scanner.nextLine();
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
                            number = ExceptionInteger.checkIntegerNumber();
                            switch (number) {
                                case 1:
                                    System.out.print("Input the new name: ");
                                    name = Regex.checkName();
                                    employeeController.editName(employee, name);
                                    System.out.println("Edit success!");
                                    break;
                                case 2:
                                    System.out.print("Input the new date of birth: ");
                                    dateOfBirth = checkAge();
                                    employeeController.editDateOfBirth(employee, dateOfBirth);
                                    System.out.println("Edit success!");
                                    break;
                                case 3:
                                    gender = gender();
                                    employeeController.editGender(employee, gender);
                                    System.out.println("Edit success!");
                                    break;
                                case 4:
                                    System.out.print("Input the new ID number: ");
                                    idNumber = Regex.checkIDNumber();
                                    employeeController.editIdNumber(employee, idNumber);
                                    System.out.println("Edit success!");
                                    break;
                                case 5:
                                    System.out.print("Input the new phone number: ");
                                    phoneNumber = Regex.checkPhoneNumber();
                                    employeeController.editPhoneNumber(employee, phoneNumber);
                                    System.out.println("Edit success!");
                                    break;
                                case 6:
                                    System.out.print("Input the new email: ");
                                    email = Regex.checkEmail();
                                    employeeController.editEmail(employee, email);
                                    System.out.println("Edit success!");
                                    break;
                                case 7:
                                    level = level();
                                    employeeController.editLevel(employee, level);
                                    System.out.println("Edit success!");
                                    break;
                                case 8:
                                    position = position();
                                    employeeController.editPosition(employee, position);
                                    System.out.println("Edit success!");
                                    break;
                                case 9:
                                    System.out.print("Input the new salary: ");
                                    salary = Long.parseLong(scanner.nextLine());
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
                        choice = scanner.nextLine();
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
                    name = scanner.nextLine();
                    employeeByName = employeeController.findByName(name);
                    if (employeeByName.size() != 0) {
                        for (Employee employee1 : employeeByName) {
                            System.out.println("Find: " + employee1);
                        }
                    } else {
                        System.out.println("NOT found name!!");
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Please input the number in the list!");
            }
        } while (true);
    }

    public static Employee showInformation() {
        String idStaff = Regex.checkIDStaff();
        while (employeeController.findIdStaff(idStaff) != null) {
            System.out.println("ID already exists, cannot be duplicated, input again: ");
            idStaff = Regex.checkIDStaff();
        }

        String name = Regex.checkName();

        LocalDate dateOfBirth = checkAge();

        String gender = gender();

        String idNumber = Regex.checkIDNumber();

        String phoneNumber = Regex.checkPhoneNumber();

        String email = Regex.checkEmail();

        String level = level();

        String position = position();

        long salary = checkSalary();
        return new Employee(idStaff, name, dateOfBirth, gender, idNumber, phoneNumber, email, level, position, salary);
    }
    public static long checkSalary(){
        System.out.println("Input the salary: ");
        long salary = ExceptionLong.checkLongNumber();
        while (salary <= 0) {
            System.out.println("Salary cannot be negative, input again: ");
            salary = ExceptionLong.checkLongNumber();
        }
        return salary;
    }
    public static LocalDate checkAge(){
        String dateOfBirthStr = Regex.checkDateOfBirth();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
        boolean checkAge = Regex.checkAge(dateOfBirthStr);
        while (!checkAge) {
            System.out.println("Age not enough 18 old, input again: ");
            dateOfBirthStr = Regex.checkDateOfBirth();
            dateOfBirth = LocalDate.parse(dateOfBirthStr);
            checkAge = Regex.checkAge(dateOfBirthStr);
        }
        return dateOfBirth;
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
        do {
            System.out.println("1. Intermediate \n" +
                    "2. College\n" +
                    "3. University \n" +
                    "4. Postgraduate");
            System.out.print("Choice the new level: ");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    return "Intermediate";
                case 2:
                    return "College";
                case 3:
                    return "University";
                case 4:
                    return "Postgraduate";
                default:
                    System.out.println("Please choice the number in list!");
            }
        } while (true);

    }

    public static String position() {
        do {
            System.out.println("1. Receptionist \n" +
                    "2. Server\n" +
                    "3. Specialist\n" +
                    "4. Supervisor\n" +
                    "5. Manager\n" +
                    "6. Director");
            System.out.print("Choice the new level: ");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    return "Receptionist";
                case 2:
                    return "Server";
                case 3:
                    return "Specialist";
                case 4:
                    return "Supervisor";
                case 5:
                    return "Manager";
                case 6:
                    return "Director";
                default:
                    System.out.println("Please choice the number in the list!");
            }
        } while (true);
    }

}
