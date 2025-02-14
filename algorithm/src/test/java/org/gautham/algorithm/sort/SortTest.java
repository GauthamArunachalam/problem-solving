package org.gautham.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

  protected Sort sort;

  @Test
  public void basicCase() {
    int[] arr = new int[] {5, 3, 8, 4, 2};
    sort.sort(arr);
    assertArrayEquals(new int[] {2, 3, 4, 5, 8}, arr);
  }

  @Test
  public void alreadySortedArray() {
    int[] arr = new int[] {1, 2, 3, 4, 5};
    sort.sort(arr);
    assertArrayEquals(new int[] {1, 2, 3, 4, 5}, arr);
  }

  @Test
  public void reverseSortedArray() {
    int[] arr = new int[] {9, 7, 5, 3, 1};
    sort.sort(arr);
    assertArrayEquals(new int[] {1, 3, 5, 7, 9}, arr);
  }

  @Test
  public void largeNumbers() {
    int[] arr = new int[] {1000, 500, 100, 50, 10};
    sort.sort(arr);
    assertArrayEquals(new int[] {10, 50, 100, 500, 1000}, arr);
  }

  @Test
  public void negativeNumbers () {
    int[] arr = new int[] {-5, -1, -3, -2, -4};
    sort.sort(arr);
    assertArrayEquals(new int[] {-5, -4, -3, -2, -1}, arr);
  }

  @Test
  public void mixedNumbers() {
    int[] arr = new int[] {3, -2, -5, 1, 0, -1, 2};
    sort.sort(arr);
    assertArrayEquals(new int[] {-5, -2, -1, 0, 1, 2, 3}, arr);
  }

  @Test
  public void sameNumbers() {
    int[] arr = new int[] {5, 5, 5, 5, 5};
    sort.sort(arr);
    assertArrayEquals(new int[] {5, 5, 5, 5, 5}, arr);
  }

  @Test
  public void alteringNumbers() {
    int[] arr = new int[] {1, 100, 2, 99, 3, 98, 4, 97};
    sort.sort(arr);
    assertArrayEquals(new int[] {1, 2, 3, 4, 97, 98, 99, 100}, arr);
  }

  @Test
  public void nearlySortedArray() {
    int[] arr = new int[] {1, 2, 3, 5, 4, 6, 7, 8, 9};
    sort.sort(arr);
    assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
  }

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
    for (int a : arr) {
      System.out.print(a + " ");
    }
    assertArrayEquals(new int[]{3, 4, 6, 7, 7, 23, 55}, arr);
  }

  @Test
  public void higherSizeArrCase() {
    int[] arr = new int[] {4, 7, 23, 7, 55, 3, 6, 67, 43, 56, 24, 86, 45, 54};
    sort.sort(arr);
    for (int a : arr) {
      System.out.print(a + " ");
    }
    assertArrayEquals(new int[]{3, 4, 6, 7, 7, 23, 24, 43, 45, 54, 55, 56, 67, 86}, arr);
  }
}
