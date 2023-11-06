package ss1_introduction_to_java.exercise;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        System.out.println("Chuyển đổi từ USD sang VND");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD để đổi thử:");
        float currencyUSD = scanner.nextFloat();
        int rate = 23000;
        float result = rate * currencyUSD;
        System.out.println("Số tiền VND bạn đổi được là:" + result);
    }
}
