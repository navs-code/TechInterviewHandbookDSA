package com.arrays;

public class BestTimeBuySellStock {

    public int bestTimeToBuySellStock(int[] prices) {
        /*int buyPrice = prices[0], sellPrice=prices[1], profit=0;
        for(int i=0; i<prices.length-1; i++) {
            if((prices[i] > prices[i+1]) && ((prices[i] >= buyPrice) || (prices[i+1] <= sellPrice))){
                continue;
            }
            else {
                if(prices[i] < buyPrice) {
                    buyPrice = prices[i];
                }
                if(prices[i+1] > sellPrice) {
                    sellPrice = prices[i+1];
                }
                profit = sellPrice-buyPrice;
            }
        }
        return profit; */

        // refactored code
        int buyPrice = prices[0], sellPrice=prices[1], profit=sellPrice-buyPrice;
        for(int i=1; i<prices.length-1; i++) {
            if(prices[i] < buyPrice) {
                    buyPrice = prices[i];
                }
            if(prices[i+1] > sellPrice) {
                    sellPrice = prices[i+1];
                }
                profit = sellPrice-buyPrice;
            }
        return profit;
    }
}

/*
Approach and code from leetcode
Approach
    Initialize variables buy with the first element of the prices array and profit as 0.
    Iterate through the prices starting from the second element.
    Update the buy variable if the current price is lower than the current buying price.
    Update the profit if the difference between the current price and the buying price is greater than the current profit.
    Return the final profit.
Kadane's Algorithm
Kadane's Algorithm is a dynamic programming technique used to find the maximum subarray sum in an array of numbers. The algorithm maintains two variables: max_current represents the maximum sum ending at the current position, and max_global represents the maximum subarray sum encountered so far. At each iteration, it updates max_current to include the current element or start a new subarray if the current element is larger than the accumulated sum. The max_global is updated if max_current surpasses its value.
Relating with the Approach
In the provided approach for finding the maximum profit in stock prices, the algorithm can be seen as a variation of Kadane's Algorithm. Instead of finding the maximum subarray sum directly, it focuses on finding the maximum positive difference between consecutive elements (prices) in the array.
Here's how the approach relates to Kadane's Algorithm:
Initialization:
        In Kadane's Algorithm, max_current and max_global are initialized to the first element of the array.
        In the stock profit approach, buy is initialized with the first element of the prices array, and profit is initialized to 0.
Iteration:
        Kadane's Algorithm iterates through the array, updating max_current based on the current element's value and deciding whether to start a new subarray.
        The stock profit approach iterates through the prices array, updating buy when a lower price is encountered and treating the difference between the current price and buy as a potential profit.
Comparison and Update:
        Kadane's Algorithm compares and updates max_current and max_global at each iteration.
        The stock profit approach compares and updates profit whenever a positive difference between the current price and buy exceeds the current profit.

Complexity
    Time complexity: O(n), where n is the length of the prices array. The algorithm iterates through the array once.
    Space complexity: O(1), as only a constant amount of extra space is used.

Code

 Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
 */
