package ss2_Loop_and_array.exercise.loop;

import java.util.Scanner;
import java.lang.Math;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Input the number of the prime numbers");
        Scanner scanner = new Scanner(System.in);
        int qualityOfPrimeNumber = scanner.nextInt();
        int count = 0;
        int numberCheck = 2;
        boolean check;
        while (count < qualityOfPrimeNumber){
            check = true;
            for(int i = 2; i <= Math.sqrt(numberCheck); i++){
                if(numberCheck % i == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(numberCheck);
                count++;
            }
            numberCheck++;
        }
    }
}
