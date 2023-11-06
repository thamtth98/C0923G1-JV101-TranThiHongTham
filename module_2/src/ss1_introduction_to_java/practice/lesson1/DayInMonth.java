package ss1_introduction_to_java.practice.lesson1;
import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        System.out.println("Nhập tháng");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng nhập vào có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Tháng nhập vào có 30 ngày");
        }
    }
}
