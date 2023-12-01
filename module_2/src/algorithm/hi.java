package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hi {
    public static void main(String[] args) {
        //sắp ếp các số trừ số -1
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        List<Integer> b = new ArrayList<>();
        List<Integer> copyA = new ArrayList<>();
        int temp = 0;
        //tìm vị trí -1 lưu vào b
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                b.add(i);
            }
        }
        System.out.println(b);
        //sắp xếp a
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        //copy a
        for (int j : a) {
            if (j != -1) {
                copyA.add(j);
            }
        }
        System.out.println(copyA);
        for(int p = 0; p < b.size(); p++ ){
            copyA.add(b.get(p),-1);
        }
        System.out.println(copyA);
        int[] result = new int[copyA.size()];
        for(int d = 0; d < result.length; d++){
            result[d] = copyA.get(d);
        }
        System.out.println(Arrays.toString(result));


    }
}
