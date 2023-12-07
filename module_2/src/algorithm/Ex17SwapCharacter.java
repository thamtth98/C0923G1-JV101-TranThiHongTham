package algorithm;

public class Ex17SwapCharacter {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "bc";
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        boolean flag = true;
        int count = 0;
        if (str1.length() != str2.length()) {
            flag = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                count = 0;
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].equals(arr2[j])) {
                        arr2[j] = "-";
                        count++;
                    }
                }
                if (count != 1) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        System.out.println(flag);
    }
}
