import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1 }, { 3 } };
        System.out.println(Arrays.toString(search(matrix, 3)));
    }

    private static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1) {
            return binarySearch(matrix, target, 0, 0, col - 1);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cmid = col / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cmid] == target) {
                return new int[] { mid, cmid };
            } else if (matrix[mid][cmid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if (matrix[rStart][cmid] == target) {
            return new int[] { rStart, cmid };
        } else if (matrix[rStart + 1][cmid] == target) {
            return new int[] { rStart + 1, cmid };
        }

        else if (target <= matrix[rStart][cmid]) {
            return binarySearch(matrix, target, rStart, 0, cmid);
        } else if (target >= matrix[rStart][cmid] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, target, rStart, cmid, col - 1);
        } else if (target <= matrix[rStart + 1][cmid]) {
            return binarySearch(matrix, target, rStart + 1, 0, cmid);
        } else {
            return binarySearch(matrix, target, rStart + 1, cmid, col - 1);
        }
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            int cmid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cmid] == target) {
                return new int[] { row, cmid };
            } else if (matrix[row][cmid] < target) {
                cStart = cmid + 1;
            } else {
                cEnd = cmid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
