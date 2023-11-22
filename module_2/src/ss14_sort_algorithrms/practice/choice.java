package ss14_sort_algorithrms.practice;

import java.util.Arrays;

public class choice {
    public static void main(String[] args) {
        int indexOfMin; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
         int[] array = {8,9,3,2,6,4};
        for (int i = 0; i < array.length - 1; i++){
            indexOfMin = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[j] < array[indexOfMin])
                    indexOfMin = j; // ghi nhận vị trí phần tử nhỏ nhất
            }
            if (indexOfMin != i){
                int temp = array[indexOfMin];
                array[indexOfMin] = array[i];
                array[i] = temp;
            }
        }

    }

}
