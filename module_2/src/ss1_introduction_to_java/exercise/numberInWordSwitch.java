package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class numberInWordSwitch {
    public static void main(String[] args) {
        System.out.println("Nhập số để tui đọc thành chữ: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] numUnitList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] wordsUnitList = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        for(int i = 0; i < numUnitList.length; i++){
            if(number == i) {
                System.out.println(wordsUnitList[i]);
            }
        }
//        if(number >= 0){
//                switch (number){
//                    case 1:
//                        System.out.println("One");
//                        break;
//                    case 2:
//                        System.out.println("Two");
//                        break;
//                    case 3:
//                        System.out.println("Three");
//                        break;
//                    case 4:
//                        String four = "Four";
//                        System.out.println(four);
//                        break;
//                    case 5:
//                        String five = "Five";
//                        System.out.println(five);
//                        break;
//                    case 6:
//                        String six = "Six";
//                        System.out.println(six);
//                        break;
//                    case 7:
//                        String seven = "Seven";
//                        System.out.println(seven);
//                        break;
//                    case 8:
//                        String eight = "Eight";
//                        System.out.println(eight);
//                        break;
//                    case 9:
//                        String nine = "Nine";
//                        System.out.println(nine);
//                        break;
//                    case 10:
//                        System.out.println("Ten");
//                        break;
//                    case 11:
//                        System.out.println("Eleven");
//                        break;
//                    case 12:
//                        System.out.println("Twelve");
//                        break;
//                    case 13:
//                        System.out.println("Third teen");
//                        break;
//                    case 14:
//                        System.out.println("Four");
//                        break;
//                }
//            }
//        }
    }
}
