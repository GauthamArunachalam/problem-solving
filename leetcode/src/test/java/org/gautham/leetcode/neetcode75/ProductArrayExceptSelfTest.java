package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductArrayExceptSelfTest {

  private final ProductArrayExceptSelf productArrayExceptSelf = new ProductArrayExceptSelf();

  @Test
  public void baseCase() {
    assertArrayEquals(new int[]{24, 12, 8, 6}, productArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
  }

  @Test
  public void negativeNosCase() {
    assertArrayEquals(new int[]{0, 0, 9, 0, 0}, productArrayExceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
  }

  @Test
  public void largeNosCase() {
    assertArrayEquals(new int[]{2624, 15744, 984, 768}, productArrayExceptSelf.productExceptSelf(new int[]{12, 2, 32, 41}));
  }
}
