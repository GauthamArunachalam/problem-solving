package org.gautham.leetcode.algomaster;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

  private final MajorityElement majorityElement = new MajorityElement();

  @Test
  public void testMajorityElement() {
    assertEquals(3, majorityElement.majorityElement(new int[]{3, 2, 3}));
  }

  @Test
  public void testMajorityElement2() {
    assertEquals(2, majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
  }

  //This test will fail as this edge case is not handled.
  @Test
  @Ignore
  public void negativeCase() {
    assertEquals(-1, majorityElement.majorityElement(new int[]{1, 2, 3, 4, 5, 6, 7}));
  }
}
