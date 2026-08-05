// Last updated: 8/5/2026, 2:02:11 PM
class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }

        return profit;
    }
}