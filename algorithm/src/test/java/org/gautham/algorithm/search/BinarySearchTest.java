package org.gautham.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

  private final BinarySearch search = new BinarySearch();

  @Test
  public void oddNosPositiveCase() {
    assertEquals(3, search.search(new int[]{1, 2, 3, 4, 5}, 4));
  }

  @Test
  public void evenNosPositiveCase() {
    assertEquals(1, search.search(new int[]{1, 2, 4, 5}, 2));
  }

  @Test
  public void oddNosNegativeCase() {
    assertEquals(-1, search.search(new int[]{1, 2, 3, 4, 5}, 8));
  }

  @Test
  public void evenNosNegativeCase() {
    assertEquals(-1, search.search(new int[]{1, 2, 3, 5}, 9));
  }

  @Test
  public void distributedNosPositiveCase() {
    assertEquals(2, search.search(new int[]{11, 25, 53, 75, 98, 123, 234}, 53));
  }

  @Test
  public void distributedNosNegativeCase() {
    assertEquals(-1, search.search(new int[]{11, 25, 53, 75, 98, 123, 234}, 768));
  }
}
