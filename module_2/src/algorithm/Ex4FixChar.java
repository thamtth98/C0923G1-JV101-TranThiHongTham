package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Ex4FixChar {
    public static void main(String[] args) {
        String str = "codeGymDaNang";
        String copyString = str.toUpperCase();
        String[] array = str.split("");
        String[] arrayCopy = copyString.split("");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (arrayCopy[i].equals(array[i])) {
                result.append(" ");
                result.append(array[i].toLowerCase());
            } else {
                result.append(array[i]);
            }
        }
        System.out.println(result.toString().trim());
    }
}
