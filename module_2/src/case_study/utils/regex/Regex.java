package case_study.utils.regex;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String REGEX_ID_STAFF = "^NV-\\d{4}$";
    private static final String REGEX_ID_NUMBER = "\\d{9}|\\d{12}";
    private static final String REGEX_PHONE_NUMBER = "^0\\d{9}$";
    private static final String REGEX_DATE_OF_BIRTH = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|1\\d|2\\d|3[0-1])$";
    private static final String REGEX_ID_CUSTOMER = "^KH-\\d{4}$";
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+$";
    private static final String REGEX_ID_VILLA = "^SVVL-\\d{4}$";
    private static final String REGEX_ID_HOUSE = "^SVHO-\\d{4}$";
    private static final String REGEX_ID_ROOM = "^SVRO-\\d{4}$";


    private static Scanner scanner = new Scanner(System.in);
    private static String str;

    public static String checkName() {
        System.out.print("Input the name (capitalize the first letter of each word): ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_NAME)){
                break;
            }else {
                System.out.println("Name is NOT correct format");
                System.out.print("Input again the name (capitalize the first letter of each word): ");
                str = scanner.nextLine();
            }
        }
       return str;
    }
    public static String checkIDStaff(){
        System.out.print("Input the ID staff (NV-XXXX (X is number)): ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_STAFF)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID staff (NV-XXXX (X is number)): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }

    public static String checkIDCustomer(){
        System.out.print("Input the ID Customer (KH-XXXX (X is number)): ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_CUSTOMER)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID staff (KH-XXXX (X is number)): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkIDNumber(){
        System.out.print("Input the ID Number (9 or 12 digits):  ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_NUMBER)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID Number (9 or 12 digits): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkPhoneNumber(){
        System.out.print("Input the phone number (10 digits and start 0): ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_PHONE_NUMBER)){
                break;
            }else {
                System.out.println("Phone number is NOT correct format, input again the phone number(10 digits and start 0): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkDateOfBirth(){
        System.out.print("Input the date of birth: (YYYY-MM-DD) ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_DATE_OF_BIRTH)){
                break;
            }else {
                System.out.println("Date of birth is NOT correct format, input again the date of birth(YYYY-MM-DD): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }

    public static boolean checkAge(String str){
        LocalDate dateOfBirth = LocalDate.parse(str);
        LocalDate now = LocalDate.now();
        Period age = Period.between(dateOfBirth,now);
        if (age.getYears() >= 18){
            return true;
        } else {
            return false;
        }
    }
    public static String checkEmail(){
        System.out.print("Input the email: ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_EMAIL)){
                break;
            }else {
                System.out.println("Email is NOT correct format, input again the email: ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkIDVilla(){
        System.out.print("Input the ID villa (SVVL-YYYY (Y is number)): ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_VILLA)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID villa (SVVL-YYYY (Y is number)): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkIDHouse(){
        System.out.print("Input the ID house (SVHO-YYYY (Y is number)): ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_HOUSE)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID house (SVHO-YYYY (Y is number)): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkIDRoom(){
        System.out.print("Input the ID room (SVRO-YYYY (Y is number)): ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_HOUSE)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID room (SVRO-YYYY (Y is number)): ");
                str = scanner.nextLine();
            }
        }
        return str;
    }


//    public static void main(String[] args) {
//        checkEmail();
//    }

}
