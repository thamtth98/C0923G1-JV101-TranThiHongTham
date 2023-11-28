package ss18_string_regex.validate_class;

import java.util.Scanner;

public class ValidateClass {
    //    private static final String REGEX_CLASS = "^[ACP][0-9]{4}[GHIK]$";
    private static final String REGEX_CLASS = "^[ACP]\\d{4}[GHIK]$";

    public static boolean checkValidateGrade(String grade) {
        return grade.matches(REGEX_CLASS);
    }

    public static void main(String[] args) {
        System.out.print("Please input the class: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();
        while (true) {
            if (checkValidateGrade(grade)) {
                break;
            } else {
                System.out.println("Invalid class name!");
                System.out.print("Please input the class: ");
                grade = scanner.nextLine();
            }
        }
        System.out.println("Valid class name!");
    }
}
