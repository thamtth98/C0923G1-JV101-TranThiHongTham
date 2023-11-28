package ss18_string_regex.validate_phone;

import java.util.Scanner;

public class ValidatePhoneNumber {
    //private static final String REGEX_PHONE_NUMBER = "^[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$";
    private static final String REGEX_PHONE_NUMBER = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public static boolean checkValidateClass(String phoneNumber){
        return phoneNumber.matches(REGEX_PHONE_NUMBER);
    }
    public static void main(String[] args) {
        System.out.print("Please input the phone number: ");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        while (true) {
            if (checkValidateClass(phoneNumber)) {
                break;
            } else {
                System.out.println("Invalid phone number!");
                System.out.print("Please input the phone number: ");
                phoneNumber = scanner.nextLine();
            }
        }
        System.out.println("Valid phone number!");

    }
}
