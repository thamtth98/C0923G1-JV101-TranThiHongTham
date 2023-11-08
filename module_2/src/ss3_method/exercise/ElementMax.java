package ss3_method.exercise;

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
        float[][] matrix = SumOfDiagonal.createMatrix();
        System.out.println("The max in matrix is:" + findMax(matrix));
    }

}
