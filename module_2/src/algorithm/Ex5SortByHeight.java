package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex5SortByHeight {
    public static void main(String[] args) {
        int[] arr = {-1, 150, 165, 170, -1, -1, 160, 180};
        List<Integer> newArr = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                indexList.add(i);
            } else {
                newArr.add(arr[i]);
            }
        }
        Collections.sort(newArr);
        System.out.println(newArr);
        for (Integer index : indexList) {
            newArr.add(index, -1);
        }
        System.out.println(newArr);

    }
}
