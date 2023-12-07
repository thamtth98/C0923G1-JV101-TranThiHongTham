package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static algorithm.Ex7PrimeNumber.checkPrime;

public class Ex22TotalPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> primeList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        System.out.print("Input the number: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i < number - 1; i++) {
            if (checkPrime(i)) {
                primeList.add(i);
            }
        }
        System.out.println("List prime: "+primeList);
        for (int i = 0; i < primeList.size() ; i++){
            for (int j = i; j < primeList.size(); j++){
                if(primeList.get(i) + primeList.get(j) == number){
                    result.add(primeList.get(i));
                    result.add(primeList.get(j));
                    break;
                }
            }
            if(result.size() != 0){
                break;
            }
        }
        System.out.println(result);
    }

}
