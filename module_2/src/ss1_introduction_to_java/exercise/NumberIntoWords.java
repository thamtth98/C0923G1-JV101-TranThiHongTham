package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        System.out.println("Nhập số để tui đọc thành chữ: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds;
        int tens;
        int unit = number % 10;
        String[] wordsUnitList = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        if (number < 10) {
            System.out.println(wordsUnitList[number]);
        } else if (number <= 13) {
            switch (number) {
                case 11:
                    System.out.println("Elevent");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Third teen");
                    break;
            }
        } else if (number < 20) {
            System.out.println(wordsUnitList[unit] + "teen");
        } else if (number < 30) {
            System.out.println("Twenty " + wordsUnitList[unit]);
        } else if (number < 40) {
            System.out.println("Thirty " + wordsUnitList[unit]);
        } else if (number < 50) {
            System.out.println("Fourty " + wordsUnitList[unit]);
        } else if (number < 60) {
            System.out.println("Fifty " + wordsUnitList[unit]);
        } else if (number < 100) {
            tens = number / 10;
            System.out.println(wordsUnitList[tens] + "ty " + wordsUnitList[unit]);
        } else if (number <= 999) {
            hundreds = number / 100;
            tens = number % 100;
            unit = tens % 10;
            String resultTens = "";
            if(tens == 0){
                resultTens = wordsUnitList[unit];
            } else if (tens <= 10) {
                resultTens = "and " + wordsUnitList[unit];
            } else if(tens == 11) {
                resultTens = "and Elevent " ;
            } else if(tens == 12) {
                resultTens = "and Twelve " ;
            }else if(tens == 13) {
                resultTens = "and Third teen " ;
            }else if(tens == 14) {
                resultTens = "and Four teen " ;
            }else if(tens == 15) {
                resultTens = "and Fifteen " ;
            } else if(tens < 20) {
                resultTens = "and " + wordsUnitList[unit]+ " teen " ;
            }else if(tens < 30){
                resultTens = "and Twenty " + wordsUnitList[unit];
            } else if (tens < 40) {
                resultTens = "and Thirty " + wordsUnitList[unit];
            } else if (tens < 50) {
                resultTens = "and Fourty " + wordsUnitList[unit];
            } else if (tens < 60) {
                resultTens = "and Fifty " + wordsUnitList[unit];
            } else {
                int tenOfHundred = tens / 10;
                resultTens = wordsUnitList[tenOfHundred] + "ty " + wordsUnitList[unit];
            }
            System.out.println(wordsUnitList[hundreds] + " hundred " + resultTens);
        }
    }
}

