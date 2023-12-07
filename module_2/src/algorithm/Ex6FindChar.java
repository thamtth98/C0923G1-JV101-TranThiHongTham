package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Ex6FindChar {
    public static void main(String[] args) {
        String str = "abdceffecdba";
        String[] arr = str.split("");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length;j++){
                if(arr[i].equals(arr[j])){
                    result.add(arr[i]);
                }
            }
        }
        System.out.println(result);
    }
}
