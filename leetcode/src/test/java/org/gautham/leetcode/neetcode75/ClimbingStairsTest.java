package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

  private ClimbingStairs climbingStairs = new ClimbingStairs();

  @Test
  public void baseCase1() {
    assertEquals(2, climbingStairs.climbStairs(2));
  }

  @Test
  public void baseCase2() {
    assertEquals(3, climbingStairs.climbStairs(3));
  }

  @Test
  public void midCaseNumber() {
    assertEquals(8, climbingStairs.climbStairs(5));
  }

  @Test
  public void midCaseNumber2() {
    assertEquals(21, climbingStairs.climbStairs(7));
  }
}
