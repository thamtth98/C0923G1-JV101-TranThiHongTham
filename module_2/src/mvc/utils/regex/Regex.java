package mvc.utils.regex;

import java.util.Scanner;

public class Regex {
    private static final String REGEX_ID = "^HV-[0-9]{3}$";
    private static final String REGEX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static Scanner scanner = new Scanner(System.in);

    public static boolean checkID(String id) {
        return id.matches(REGEX_ID);
    }

    public static boolean checkName(String name){
        return name.matches(REGEX_NAME);
    }
}
