package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicateTest {

  private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

  @Test
  public void notContainsDuplicate() {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    assertEquals(false, containsDuplicate.containsDuplicate(arr));
  }

  @Test
  public void containsDuplicate() {
    int[] arr = new int[]{1, 2, 3, 4, 5, 3};
    assertEquals(true, containsDuplicate.containsDuplicate(arr));
  }

  @Test
  public void multipleDuplicates() {
    int[] arr = new int[]{1, 2, 3, 4, 5, 3, 5};
    assertEquals(true, containsDuplicate.containsDuplicate(arr));
  }
}
