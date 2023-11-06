package ss2_Loop_and_array.practice.loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        int[] arrayA = {1,2,3};
//        for (int i:arrayA) {
//            i = 1;
//            System.out.println(i);
//        }
//        for(int i:arrayA){
//            System.out.println(i);
//        }
        int[] arrayA = {1,2,3};
        for(int i = 0; i < arrayA.length; i++){
            arrayA[i] = 1;
            System.out.println(Arrays.toString(arrayA));
        }
        for(int i = 0; i < arrayA.length; i++){
            System.out.println(Arrays.toString(arrayA));
        }
    }
}
