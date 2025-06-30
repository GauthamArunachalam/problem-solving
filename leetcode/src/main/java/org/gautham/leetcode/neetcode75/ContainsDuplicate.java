package org.gautham.leetcode.neetcode75;

import java.util.HashSet;

public class ContainsDuplicate {

  /**
   * Check is the given array contains any duplicates.
   * Returns true if duplicate is present else returns false
   * It uses a HashSet to see if there are any duplicates in the given array*/
  public boolean containsDuplicate(int[] nums) {

    HashSet<Integer> uniqueElements = new HashSet<>();

    for(int num : nums) {
      if (uniqueElements.contains(num)) return true;
      uniqueElements.add(num);
    }

    return false;
  }
}
