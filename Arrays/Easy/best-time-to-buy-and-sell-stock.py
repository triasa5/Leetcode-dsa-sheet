class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        left = 0 #buy
        right = 1 #sell
        while right < len(prices):
            current_profit = prices[right] - prices[left] #ccurrent profit
            if (prices[left] < prices[right]):
                max_profit = max(max_profit, current_profit) #if there is profit, calculate max profit
            else:
                left = right  #otherwise move the left pointer
            right += 1 # right is incremented at each stage
        return max_profit
            
