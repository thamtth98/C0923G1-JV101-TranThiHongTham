package algorithm;

import case_study.utils.exception.ExceptionInteger;

import java.util.ArrayList;
import java.util.List;

public class Ex9NumberOfRound {
    public static boolean checkNumberOfRound(int number){
        boolean flag = true;
        if(number <= 0){
            flag = false;
        }else if(number < 10){
            flag = true;
        }else {
           String stringNum = String.valueOf(number);
            if(stringNum.charAt(0) == stringNum.charAt(stringNum.length() - 1)){
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Input the min number to check number circle: ");
        int min = ExceptionInteger.checkIntegerNumber();
        System.out.println("Input the max number to check number circle: ");
        int max = ExceptionInteger.checkIntegerNumber();
        int count = 0;
        for(int i = min; i <= max; i++){
            if(checkNumberOfRound(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
