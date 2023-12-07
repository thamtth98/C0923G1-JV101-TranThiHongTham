package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex8AppearParent {
    public static void main(String[] args) {
        int[] parent = {1,2,3};
        int[] child = {1, 8};
        int count = 0;
        List<Integer> countAppear = new ArrayList<>();
        for (int i = 0; i < child.length; i++) {
            count = 0;
            for (int j = 0; j < parent.length; j++) {
                if (child[i]==parent[j]){
                    count++;
                }
            }
            countAppear.add(count);
        }
        int result = Collections.min(countAppear);
        System.out.println(result);
    }
}
