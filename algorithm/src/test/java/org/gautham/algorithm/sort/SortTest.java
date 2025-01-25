package org.gautham.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

  protected Sort sort;

  @Test
  public void baseCase() {
    int[] arr = new int[] {45, 7, 33, 21, 4};
    sort.sort(arr);
    assertArrayEquals(new int[]{4, 7, 21, 33, 45}, arr);
  }

  @Test
  public void eventNumbersCase() {
    int[] arr = new int[] {4, 7, 33, 21, 4, 55};
    sort.sort(arr);
    assertArrayEquals(new int[]{4, 4, 7, 21, 33, 55}, arr);
  }

  @Test
  public void elementRepeatCase() {
    int[] arr = new int[] {7, 4, 23, 7, 55, 3, 6};
    sort.sort(arr);
    assertArrayEquals(new int[]{3, 4, 6, 7, 7, 23, 55}, arr);
  }

  @Test
  public void higherSizeArrCase() {
    int[] arr = new int[] {4, 7, 23, 7, 55, 3, 6, 67, 43, 56, 24, 86, 45, 54};
    sort.sort(arr);
    assertArrayEquals(new int[]{3, 4, 6, 7, 7, 23, 24, 43, 45, 54, 55, 56, 67, 86}, arr);
  }
}
