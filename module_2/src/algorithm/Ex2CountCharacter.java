package algorithm;

import java.util.Arrays;

public class Ex2CountCharacter {
    public static void main(String[] args) {
        String s1 = "Abcdef1234";
        String s2 = "Uykhldg1";

        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if(arr1[i].equals(arr2[j])){
                    count++;
                    arr2[j] = "-";
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
