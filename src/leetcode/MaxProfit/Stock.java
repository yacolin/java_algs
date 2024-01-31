package leetcode.MaxProfit;


/**
 * 股票最大收益
 */
public class Stock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;

        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    int _profit = prices[j] - prices[i];

                    profit = Math.max(_profit, profit);
                }
            }
        }

        return profit;
    }

    public int maxProfit2(int[] prices) {
        int n = prices.length;
        int dp0 = 0, dp1 = -prices[0];

        for (int i = 1; i < n; i++) {
            int newDp0 = Math.max(dp0, dp1 + prices[i]);
            int newDp1 = Math.max(dp1, dp0 - prices[i]);
            dp0 = newDp0;
            dp1 = newDp1;
        }

        return dp0;
    }

    public int maxProfit3(int[] prices) {
        int n = prices.length;
        int buy1 = -prices[0], sell1 = 0;
        int buy2 = -prices[1], sell2 = 0;

        for (int i = 1; i < n; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);

            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }

        return sell2;
    }



    public static void main(String[] args) {
        Stock stock = new Stock();

        int[] prices = {7,1,5,3,6,4};
        int profit = stock.maxProfit2(prices);


        System.out.println(profit);

    }
}
