public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = { 2, 4, 1 };
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > maximumProfit) {
                maximumProfit = prices[i] - min;
            }
        }
        return maximumProfit;
    }
}
