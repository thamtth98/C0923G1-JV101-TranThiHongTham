package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Ex1Frequency {
    public static boolean checkEqualFrequency() {
        int[] inputArray = {4, 3, 2, 1, 2, 3, 1};
        List<Integer> onlyNumber = new ArrayList<>();
        List<Integer> countNumber = new ArrayList<>();
        int count = 0;
        boolean flag = true;
        for (int i : inputArray) {
            if (!onlyNumber.contains(i)) {
                onlyNumber.add(i);
            }
        }
        System.out.println(onlyNumber);
        for (int j : onlyNumber) {
            count = 0;
            for (int k : inputArray) {
                if (j == k) {
                    count += 1;
                }
            }
            countNumber.add(count);
        }
        System.out.println(countNumber);

        if(countNumber.size() != 1){
            for (int i = 1; i < countNumber.size(); i++) {
                if (countNumber.get(i) != countNumber.get(i - 1)) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(checkEqualFrequency());
    }
}
