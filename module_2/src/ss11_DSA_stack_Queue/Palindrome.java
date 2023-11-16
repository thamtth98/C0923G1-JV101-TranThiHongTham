package ss11_DSA_stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string check palindrome:");
        String str = scanner.nextLine();
        Stack<String> charStack = new Stack<>();
        Queue<String> charQueue = new LinkedList<>();

        String[] charString = str.split("");
        for(int i = 0; i < charString.length; i++){
            charStack.push(charString[i].toLowerCase());
            charQueue.offer(charString[i].toLowerCase());
        }
        int length = charQueue.size();
        int count = 0;
        for(int i = 0; i < length; i++){
            if(charQueue.poll().equals(charStack.pop())){
                count = 0;
            }else {
                count++;
                break;
            }
        }
        if(count != 0){
            System.out.println("This isn't Palindrome!");
        } else {
            System.out.println("This is Palindrome!");
        }
    }
}
