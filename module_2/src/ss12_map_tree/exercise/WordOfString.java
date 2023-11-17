package ss12_map_tree.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordOfString {
    public static void main(String[] args) {
        System.out.println("Input the string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<String, Integer> countWord = new TreeMap<>();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!countWord.containsKey(arr[i].toLowerCase())) {
                countWord.put(arr[i].toLowerCase(), 1);
            } else {
                countWord.put(arr[i].toLowerCase(), countWord.get(arr[i].toLowerCase()) + 1);
            }
        }
        System.out.println(countWord);
    }
}
