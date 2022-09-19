import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 0 }, { 2, 1, 1 } };
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
        setZero(matrix);
        System.out.println("After changing the array");
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }

    private static void setZero(int[][] matrix) {
        boolean col0 = true;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                col0 = false;
            }
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == false) {
                matrix[i][0] = 0;
            }
        }
    }
}
