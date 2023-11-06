package ss1_introduction_to_java.practice.lesson1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Nhập chiều cao và cân nặng để tính chỉ số BMI");
        System.out.println("Nhập chiều cao: ");
        Scanner scanner = new Scanner(System.in);

        double height, weight, bmi;
        height = scanner.nextDouble();

        System.out.println("Nhập cân nặng: ");
        weight = scanner.nextDouble();

        bmi = weight / (Math.pow(height, 2));
        if (bmi < 18) {
            System.out.printf("Chỉ số BMI là %.2f : Gầy", bmi);
        } else if (bmi < 25) {
            System.out.printf("Chỉ số BMI là %.2f : Bình thường", bmi);
        } else if (bmi < 30) {
            System.out.printf("Chỉ số BMI là %.2f: Mập", bmi);
        } else {
            System.out.printf("Chỉ số BMI là %.2f: Béo phì", bmi);
        }
    }
}
