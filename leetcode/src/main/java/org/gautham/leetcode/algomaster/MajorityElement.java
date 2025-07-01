package org.gautham.leetcode.algomaster;

public class MajorityElement {

  /**
   * Find the majority element in an array. i.e an element that is present more than n/2 times.
   * If the input does not match condition an element being present more than n/2 times this implementation will return wrong output
   * This implementation used Boyer-Moore voting algo. This implementation only uses the first step if the algo. The second step is the verification of the majority element is not implemented here
   * Time Complexity : O(n)
   * Space Complexity : O(1)
   * */
  public int majorityElement(int[] nums) {
    int candidate = -1, count = 0;

    for (int num : nums) {
      if (count == 0) {
        candidate = num;
        count = 1;
      } else {
        if (num == candidate) {
          count++;
        } else {
          count--;
        }
      }
    }
    return candidate;
  }
}
