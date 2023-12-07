package algorithm;

import java.util.Arrays;

public class Ex20SortChar {
    public static void main(String[] args) {
       String[] inputArray = {"abc", "", "aaa", "a", "zz", "123"};
       String temp = "";
       for (int i = 0; i < inputArray.length -1; i++){
           for (int j = i+1; j < inputArray.length; j++){
               if(inputArray[j-1].length() > inputArray[j].length()){
                   temp =inputArray[j-1];
                   inputArray[j-1] = inputArray[j];
                   inputArray[j] = temp;
               }
           }
       }
        System.out.println(Arrays.toString(inputArray));

    }
}
