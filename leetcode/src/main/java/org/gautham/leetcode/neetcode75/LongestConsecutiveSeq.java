package org.gautham.leetcode.neetcode75;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSeq {

  /**
   * Longest consecutive sequence impl with set use
   * Time Complexity : O(n)
   * Space Complexity : O(1)
   * */
  public int longestConsecutive(int[] nums) {
    Set<Integer> uniqueNums = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet());

    int retVal = 0;
    for (int num : uniqueNums) {
      if (!uniqueNums.contains(num-1)) {
        int count = 1;
        while (uniqueNums.contains(++num)) {
          count++;
        }
        retVal = Math.max(retVal, count);
      }
    }
    return retVal;
  }
}
