package algorithm;

public class Ex3CheckArray {
    public static void main(String[] args) {
        System.out.println(beautyArray());
    }


    public static boolean beautyArray() {
        int[] array = {1, 2, -1, 2};
        int sum1 = 0;
        int sum2 = 0;
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += array[j];
            }
            for (int k = i + 1; k < array.length; k++) {
                sum2 += array[k];
            }
            if (sum1 == sum2) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
