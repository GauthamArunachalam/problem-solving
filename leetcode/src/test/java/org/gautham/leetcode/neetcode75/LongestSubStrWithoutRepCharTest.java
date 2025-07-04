package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubStrWithoutRepCharTest {

  private final LongestSubStrWithoutRepChar longestSubStrWithoutRepChar = new LongestSubStrWithoutRepChar();

  @Test
  public void baseCase() {
    assertEquals(3, longestSubStrWithoutRepChar.lengthOfLongestSubstring("abcabcbb"));
  }

  @Test
  public void singleChar() {
    assertEquals(1, longestSubStrWithoutRepChar.lengthOfLongestSubstring("bbbbb"));
  }

  @Test
  public void baseCase2() {
    assertEquals(3, longestSubStrWithoutRepChar.lengthOfLongestSubstring("pwwkew"));
  }
}
