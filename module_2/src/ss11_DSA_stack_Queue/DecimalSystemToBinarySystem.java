package ss11_DSA_stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class DecimalSystemToBinarySystem {
    public static void main(String[] args) {
        System.out.print("Input the number convert to binary system: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stack<Integer> numberStack = new Stack<>();
        StringBuilder resultString = new StringBuilder();
        int result = number % 2;
        while (number >0) {
            result = number % 2;
            System.out.print(result + "\t");
            numberStack.push(result);
            number = number / 2;
        }
        int size = numberStack.size();
        for (int i = 0; i < size; i++) {
            resultString.append(numberStack.pop());
        }
        System.out.print("Convert to binary system: " + resultString);
    }
}
