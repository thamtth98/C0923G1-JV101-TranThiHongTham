package ss1_introduction_to_java.practice.lesson1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Nhập chiều cao và cân nặng");
        System.out.println("Nhập chiều cao: ");
        Scanner scanner = new Scanner(System.in);
//        double height, weight, bmi;
        float height = scanner.nextFloat();

        System.out.println("Nhập cân nặng: ");
        float weight = scanner.nextFloat();

        float bmi = (float) (height / Math.pow(weight, 2));
        //vì số thực bình phương là lớn, nên sẽ thành double
        /* vì số thực bình phương là lớn, nên sẽ thành double
        Bên phải sẽ là float/double thì sẽ thành double
        nhưng bên trái là float nên cần phải ép bên phải thành float
         */
    }
}
