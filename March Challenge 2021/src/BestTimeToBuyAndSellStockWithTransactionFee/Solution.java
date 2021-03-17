package BestTimeToBuyAndSellStockWithTransactionFee;

public class Solution {
    // variables names are really bad, but keep it for now until I fully understand the solution
    public int maxProfit(int[] prices, int fee) {
        // T[i][k][0] = Max(T[i-1][k][0], T[i][k][1] + prices[i] - fee)
        // T[i][k][1] = Max(T[i-1][k][1], T[i-1][k][0] - prices[i])

        int T_ik0 = 0;
        int T_ik1 = Integer.MIN_VALUE;

        for(int price: prices) {
            int temp = T_ik0;
            T_ik0 = Math.max(T_ik0, T_ik1 + price);
            T_ik1 = Math.max(T_ik1, temp - price - fee);
        }
        return T_ik0;
    }
}

/**
 * The Best Explanation for all Buy and Sell stocks problems
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/discuss/108870/most-consistent-ways-of-dealing-with-the-series-of-stock-problems
 */