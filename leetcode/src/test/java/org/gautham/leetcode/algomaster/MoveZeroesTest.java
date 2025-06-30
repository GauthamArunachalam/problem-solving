package org.gautham.leetcode.algomaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

  private final MoveZeroes moveZeroes = new MoveZeroes();

  @Test
  public void noZeros() {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    moveZeroes.moveZeroes(arr);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
  }

  @Test
  public void containZeros() {
    int[] arr = new int[]{0,1,0,3,12};
    moveZeroes.moveZeroes(arr);
    assertArrayEquals(new int[]{1, 3, 12, 0, 0}, arr);
  }

  @Test
  public void oneZero() {
    int[] arr = new int[]{0};
    moveZeroes.moveZeroes(arr);
    assertArrayEquals(new int[]{0}, arr);
  }

  @Test
  public void manyZero() {
    int[] arr = new int[]{0, 0, 0};
    moveZeroes.moveZeroes(arr);
    assertArrayEquals(new int[]{0, 0, 0}, arr);
  }
}
