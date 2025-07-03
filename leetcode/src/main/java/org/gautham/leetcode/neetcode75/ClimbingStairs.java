package org.gautham.leetcode.neetcode75;

public class ClimbingStairs {

  /**
   * This questions basically boils down to fibonacci numbers.
   * This implementation uses direct fibonacci numbers.
   * The other implementation can be using DP with memoization with recursive calls.
   * Time Complexity : O(n)
   * Space Complexity : O(1)
   * */
  public int climbStairs(int n) {
    int t1 = 0, t2 = 1, t3 = 0;
    for (int i=1;i<=n;i++) {
      t3 = t1 + t2;
      t1 = t2;
      t2 = t3;
    }
    return t2;
  }
}
