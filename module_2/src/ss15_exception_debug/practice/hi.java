package ss15_exception_debug.practice;

import java.util.ArrayList;
import java.util.List;

public class hi {
    public static void main(String[] args) {
        String s = "viCodegymDaNang";
        List<String> arrays = new ArrayList<>();
        List<Integer> arrIndex = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            if (ascii <= 90 && ascii >= 65) {
                arrIndex.add(i);
            }
        }
        System.out.println(arrIndex);
        int k;
        int d = 0;
        for (int j = 0; j < arrIndex.size() - 1; j++) {
            k = arrIndex.get(j);
            if(arrIndex.get(0) !=0) {
                arrays.add(s.substring(0, k));
            }
            d = arrIndex.get(j + 1);
            arrays.add(s.substring(k, d));
        }
//        System.out.println(d);

        arrays.add(s.substring(d, s.length()));
        System.out.println(arrays);
        String result = "";
        for (int l = 0; l < arrays.size(); l++) {
            result += arrays.get(l).toLowerCase() + " ";
        }
        System.out.println(result.trim());
    }
}
