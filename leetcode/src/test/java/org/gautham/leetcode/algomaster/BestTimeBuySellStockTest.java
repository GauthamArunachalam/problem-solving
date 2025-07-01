package org.gautham.leetcode.algomaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeBuySellStockTest {

  private final BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();

  @Test
  public void bestTimeBuySellStock() {
    assertEquals(5, bestTimeBuySellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
  }

  @Test
  public void bestTimeBuySellStock2() {
    assertEquals(0, bestTimeBuySellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
  }

  @Test
  public void bestTimeBuySellStock3() {
    assertEquals(18, bestTimeBuySellStock.maxProfit(new int[]{7, 1, 4, 8, 19}));
  }
}
