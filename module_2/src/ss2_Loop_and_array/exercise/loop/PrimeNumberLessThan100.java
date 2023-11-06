package ss2_Loop_and_array.exercise.loop;
import java.util.Scanner;

public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        boolean check;
        while (number < 100){
            check = true;
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(number);
            }
            number++;

        }
    }
}
