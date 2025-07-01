package org.gautham.leetcode.neetcode75;

import java.util.HashMap;

public class TwoSum {

  /**
   * Takes in an array and a target sum returns the index of the 2 numbers that can sum up to the target
   * This implementation used HashMap to match the numbers that adds up to target val
   * Time Complexity : O(n)
   * Space Complexity : O(n)
   * */
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> sumMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (sumMap.containsKey(nums[i])) {
        return new int[] {sumMap.get(nums[i]), i};
      }
      sumMap.put(target - nums[i], i);
    }
    return new int[]{-1, -1};
  }
}
