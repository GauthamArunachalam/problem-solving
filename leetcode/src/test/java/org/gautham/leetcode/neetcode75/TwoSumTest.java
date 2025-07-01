package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

  private final TwoSum twoSum = new TwoSum();

  @Test
  public void test() {
    assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
  }

  @Test
  public void test2() {
    assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
  }

  @Test
  public void test3() {
    assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3, 3}, 6));
  }

  @Test
  public void negativeCase() {
    assertArrayEquals(new int[]{-1, -1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 59));
  }
}
