package ss1_introduction_to_java.practice.lesson1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Nhập năm");
        Scanner leapYear = new Scanner(System.in);
        int year = leapYear.nextInt();
        boolean flag;
        if (year % 100 == 0 && year % 400 != 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Là năm nhuận");
        } else {
            System.out.println("Không phải là năm nhuận");
        }
    }
}
