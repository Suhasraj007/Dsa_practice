public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 7 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(arr));
    }

    private static int maximumWealth(int[][] arr) {
        int max_wealth = 0;
        for (int i = 0; i < arr.length; i++) {
            int row_sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                row_sum += arr[i][j];
            }
            if (row_sum > max_wealth) {
                max_wealth = row_sum;
                max_wealth = row_sum;
            }
        }

        return max_wealth;
    }
}
