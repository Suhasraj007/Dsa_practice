import java.util.Arrays;

public class RowWiseAndColumnWIseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 40, 67, 78 },
                { 41, 69, 80 },
                { 45, 71, 90 },
                { 46, 72, 96 }

        };
        // System.out.println(matrix[0].length - 1);
        int[] ans = searchMatrix(matrix, 48);
        System.out.println(Arrays.toString(ans));
        // Arrays.binarySearch(a, key)
    }

    private static int[] searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[row].length - 1;

        while (row < matrix.length && column >= 0) {

            if (matrix[row][column] == target) {
                return new int[] { row, column };
            } else if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }
        }
        return new int[] { -1, -1 };
    }
}
