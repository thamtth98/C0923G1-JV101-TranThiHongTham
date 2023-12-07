package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex14CharAppear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        List<String> result = new ArrayList<>();
        String[] arr = str.split("");
        for (String item : arr) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        System.out.println(result.size());
    }
}
