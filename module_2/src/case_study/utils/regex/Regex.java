package case_study.utils.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_NAME = "^[a-zA-Z| \\s]+$";
    private static Scanner scanner = new Scanner(System.in);

    public static String checkName() {
        String str = null;
        System.out.print("Input the name: ");
        str = scanner.nextLine();
        while (true) {
            if(str.matches(REGEX_NAME)){
                break;
            }else {
                System.out.println("Name is NOT in correct format, input again the name: ");
                str = scanner.nextLine();
            }
        }
       return str;
    }
}
