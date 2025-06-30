package org.gautham.leetcode.algomaster;

public class MoveZeroes {

  /**
   * Move zeros to the end of the array.
   * Time complexity : O(n)
   * Space Complexity : O(1)
   * */
  public void moveZeroes(int[] nums) {
    int leftIndex = 0;

    for (int i=0; i<nums.length; i++) {
      if (nums[i] != 0) {
        nums[leftIndex] = nums[i];
        leftIndex++;
      }
    }

    for (int i = leftIndex; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
