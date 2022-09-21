import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 0 }, { 1, 2, 3 } };
        setZero(matrix);
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
    }

    // use my 0th row and 0th column as dummy matrix
    private static void setZero(int[][] matrix) {
        // to check wether the 0th column has zero
        int col0 = 0;

        // modifying dummy arrays
        for (int i = 0; i < matrix.length; i++) {
            // checking only the zeroth column
            if (matrix[i][0] == 0) {
                col0 = 1;
            }
            // checking all rows and columns except zeroth column
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        // setting our matrix with zeros
        // remember to traverse from the back
        for (int i = matrix.length - 1; i >= 0; i--) {
            // modiying all rows and columns except zeroth column
            for (int j = matrix[i].length - 1; j >= 1; j--) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
            // modifying zeroth column
            if (col0 == 1) {
                matrix[i][0] = 0;
            }
        }
    }
}
