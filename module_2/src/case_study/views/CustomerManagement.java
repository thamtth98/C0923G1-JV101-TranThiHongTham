package case_study.views;

import case_study.controllers.CustomerController;
import case_study.models.person.Customer;
import case_study.utils.exception.ExceptionInteger;
import case_study.utils.regex.Regex;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static case_study.views.EmployeeManagement.*;

public class CustomerManagement {
    private static CustomerController customerController = new CustomerController();
    private static Scanner scanner = new Scanner(System.in);

    public static void customer() {
        String idCustomer;
        String choice;
        int number;
        String name;
        LocalDate dateOfBirth;
        String gender;
        String idNumber;
        String phoneNumber;
        String email;
        String typeCustomer;
        String address;
        List<Customer> customerByName;
        List<Customer> customerList;
        Customer customer;
        do {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Delete customer\n" +
                    "5. Search by name customer\n" +
                    "6. Return main menu\n");
            System.out.println("Let's choice: ");
            number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    customerList = customerController.display();
                    for (Customer customers : customerList) {
                        System.out.println(customers);
                    }
                    break;
                case 2:
                    customer = infoCustomer();
                    customerController.add(customer);
                    System.out.println("Added!");
                    break;
                case 3:
                    System.out.println("Input the ID you want edit: ");
                    String id = scanner.nextLine();
                    customer = customerController.findId(id);
                    if (customer != null) {
                        System.out.println("Information you want edit " + customer);
                        System.out.print("You want edit, enter y to confirm edit: ");
                        choice = scanner.nextLine();
                        if (choice.equalsIgnoreCase("y")) {
                            System.out.println("1. Edit the name \n" +
                                    "2. Edit the date of birth \n" +
                                    "3. Edit the gender \n" +
                                    "4. Edit the ID number \n" +
                                    "5. Edit the phone number \n" +
                                    "6. Edit the email \n" +
                                    "7. Edit the type Customer \n" +
                                    "8. Edit the address ");
                            System.out.print("Let's choice: ");
                            number = ExceptionInteger.checkIntegerNumber();
                            switch (number) {
                                case 1:
                                    System.out.print("Input the new name: ");
                                    name = Regex.checkName();
                                    CustomerController.editName(customer, name);
                                    System.out.println("Edit success!");
                                    break;
                                case 2:
                                    System.out.print("Input the new date of birth: ");
                                    dateOfBirth = checkAge();
                                    customerController.editDateOfBirth(customer, dateOfBirth);
                                    System.out.println("Edit success!");
                                    break;
                                case 3:
                                    gender = gender();
                                    customerController.editGender(customer, gender);
                                    System.out.println("Edit success!");
                                    break;
                                case 4:
                                    System.out.print("Input the new ID number: ");
                                    idNumber = Regex.checkIDNumber();
                                    customerController.editIdNumber(customer, idNumber);
                                    System.out.println("Edit success!");
                                    break;
                                case 5:
                                    System.out.print("Input the new phone number: ");
                                    phoneNumber = Regex.checkPhoneNumber();
                                    customerController.editPhoneNumber(customer, phoneNumber);
                                    System.out.println("Edit success!");
                                    break;
                                case 6:
                                    System.out.print("Input the new email: ");
                                    email = Regex.checkEmail();
                                    customerController.editEmail(customer, email);
                                    System.out.println("Edit success!");
                                    break;
                                case 7:
                                    typeCustomer = typeCustomer();
                                    customerController.editTypeCustomer(customer, typeCustomer);
                                    System.out.println("Edit success!");
                                    break;
                                case 8:
                                    address = scanner.nextLine();
                                    customerController.editAddress(customer, address);
                                    System.out.println("Edit success!");
                                    break;
                                default:
                                    System.out.println("Please choice number in list!");
                            }

                        } else {
                            System.out.println("NOT edit!");
                        }
                    } else {
                        System.out.println("Not found ID");
                    }
                    break;
                case 4:
                    System.out.print("PLease input the ID customer you want delete: ");
                    idCustomer = scanner.nextLine();
                    customer = customerController.findId(idCustomer);
                    System.out.println("The information you want delete: " + customer);
                    if (customer != null) {
                        System.out.print("Do you want delete, enter y to confirm: ");
                        choice = scanner.nextLine();
                        if (choice.toLowerCase().equals("y".toLowerCase())) {
                            customerController.deleteCustomer(customer);
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
                    customerByName = customerController.findByName(name);
                    if (customerByName.size() != 0) {
                        for (Customer customer1 : customerByName) {
                            System.out.println("Find: " + customer1);
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

    public static Customer infoCustomer() {
        String idCustomer = Regex.checkIDCustomer();
        while (customerController.findId(idCustomer) != null) {
            System.out.println("ID already exists, cannot be duplicated, input again: ");
            idCustomer = Regex.checkIDCustomer();
        }
        String name = Regex.checkName();

        LocalDate dateOfBirth = checkAge();

        String gender = gender();

        String idNumber = Regex.checkIDNumber();

        String phoneNumber = Regex.checkPhoneNumber();

        String email = Regex.checkEmail();

        String typeCustomer = typeCustomer();
        System.out.println("Input the address: ");
        String address = scanner.nextLine();
        return new Customer(idCustomer, name, dateOfBirth, gender, idNumber, phoneNumber, email, typeCustomer, address);
    }

    public static String typeCustomer() {
        do {
            System.out.println("1. Diamond \n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member");
            System.out.print("Choice the type Customer: ");
            int number = ExceptionInteger.checkIntegerNumber();
            switch (number) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinum";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("Please choice the number in the list!");
            }
        } while (true);
    }
}
