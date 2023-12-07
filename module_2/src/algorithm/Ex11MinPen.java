package algorithm;

import java.util.Scanner;

public class Ex11MinPen {
    public static void main(String[] args) {
//        System.out.println(promotion(5, 2, 10));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buy x pens and get y free");
        System.out.print("Input x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Input y: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.print("Input the total pen: ");
        int s = Integer.parseInt(scanner.nextLine());
        System.out.println( promotion(x,y,s));
    }
    public static int promotion(int x, int y, int s){
        int sum = x + y;
        int result = s/sum * x + s%(x+y);
        return result;
    }
}
