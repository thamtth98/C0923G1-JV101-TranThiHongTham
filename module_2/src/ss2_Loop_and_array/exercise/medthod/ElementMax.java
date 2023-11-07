package ss2_Loop_and_array.exercise.medthod;

import java.util.Scanner;

public class ElementMax {
    public static float findMax(float[][] array) {
        float max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        float[][] maxtric = SumOfDiagonal.createMaxtric();
        System.out.println("The max in maxtric is:" + findMax(maxtric));
    }

}
