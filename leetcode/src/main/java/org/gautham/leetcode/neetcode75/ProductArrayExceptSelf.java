package org.gautham.leetcode.neetcode75;

public class ProductArrayExceptSelf {

  /**
   * Calculates product of array except self
   * Uses prefix product approach to solve this
   * Time Complexity : O(n)
   * Space Complexity : O(n)
   * */
  public int[] productExceptSelf(int[] nums) {
    int[] ans = new int[nums.length];
    int product = 1;

    for (int i=0; i<nums.length; i++) {
      ans[i] = product;
      product *= nums[i];
    }

    product = 1;
    for (int i = nums.length-1; i>=0; i--) {
      ans[i] *= product;
      product *= nums[i];
    }

    return ans;
  }
}
