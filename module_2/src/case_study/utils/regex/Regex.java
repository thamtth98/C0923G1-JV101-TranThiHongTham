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
    private static final String REGEX_DATE_OF_BIRTH = "^\\d{4}-\\d{2}-\\d{2}$";

    private static Scanner scanner = new Scanner(System.in);
    private static String str;

    public static String checkName() {
        System.out.print("Input the name: ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_NAME)){
                break;
            }else {
                System.out.println("Name is NOT correct format, input again the name: ");
                str = scanner.nextLine();
            }
        }
       return str;
    }
    public static String checkIDStaff(){
        System.out.print("Input the ID staff: ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_STAFF)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID staff: ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkIDNumber(){
        System.out.print("Input the ID Number: ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_ID_NUMBER)){
                break;
            }else {
                System.out.println("ID is NOT correct format, input again the ID Number: ");
                str = scanner.nextLine();
            }
        }
        return str;
    }
    public static String checkPhoneNumber(){
        System.out.print("Input the phone number: ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_PHONE_NUMBER)){
                break;
            }else {
                System.out.println("Phone number is NOT correct format, input again the phone number: ");
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
                System.out.println("Phone number is NOT correct format, input again the date of birth: ");
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
        }else {
            return false;
        }
    }


}
