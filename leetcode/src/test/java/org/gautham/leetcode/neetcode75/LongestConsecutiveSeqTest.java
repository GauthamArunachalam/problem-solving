package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsecutiveSeqTest {

  private final LongestConsecutiveSeq lcs = new LongestConsecutiveSeq();

  @Test
  public void baseCase() {
    assertEquals(4, lcs.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
  }

  @Test
  public void longestCase() {
    assertEquals(9, lcs.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
  }

  @Test
  public void repetativeCase() {
    assertEquals(3, lcs.longestConsecutive(new int[]{1,0,1,2}));
  }
}
