package org.gautham.leetcode.algomaster;

public class BestTimeBuySellStock {

  /**
   * Given an array of stock prices the method selects the maximum profit that we can get
   * The implementation used sliding window approach to find the solution
   * Time Complexity : O(n)
   * Space Compleixty : O(1)
   * */
  public int maxProfit(int[] prices) {
    int maxProfit = 0, leftPt = 0, rightPt = 0;
    for (; rightPt<prices.length; rightPt++ ) {
      if (prices[leftPt] > prices[rightPt]) {
        leftPt = rightPt;
        continue;
      }
      int profit = prices[rightPt] - prices[leftPt];
      maxProfit = Math.max(maxProfit, profit);
    }
    return maxProfit;
  }
}
