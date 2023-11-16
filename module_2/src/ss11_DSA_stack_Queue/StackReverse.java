package ss11_DSA_stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        //Đảo ngược phần tử trong mảng số nguyên
        int[] myArr = {1,2,3,4,5};
        Stack<Integer> newStack = new Stack<>();
        for(int i = 0; i < myArr.length; i++) {
            newStack.push(myArr[i]);
        }
        System.out.println(newStack);
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = newStack.pop();
        }
        System.out.println(Arrays.toString(myArr));

        //Đảo ngược chuỗi sử dụng Stack
        Stack<String> wordStack = new Stack<>();
        String mWord = "Hi tui ne";
        StringBuilder newWord = new StringBuilder();
        String[] arrWord = mWord.split(" ");
        for(int i = 0; i < arrWord.length; i++) {
            wordStack.push(arrWord[i]);
        }
        for(int i = 0; i < arrWord.length; i++){
            arrWord[i] = wordStack.pop() ;
        }
        System.out.println(mWord);
        for(int i = 0; i < arrWord.length; i++){
            newWord.append(arrWord[i]).append(" ");
        }
        System.out.println(newWord);
    }
}
