class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // buy
        int right = 1; // sell
        int max_profit = 0;
        int current_profit = 0;
        while (right < prices.length) {  //if there's profit, calculate max profit
            current_profit = prices[right] - prices[left];
            if (prices[left] < prices[right]) 
                max_profit = Math.max(current_profit, max_profit);
            else
                left = right;  // otherwise, move the pointer for buy
            right++;  // move the pointer for sell at each stage of the loop
        }
        return max_profit;
    }
}
