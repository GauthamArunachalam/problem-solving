package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GroupAnagramsTest {

  private final GroupAnagrams groupAnagrams = new GroupAnagrams();

  @Test
  public void test() {
    assertEquals(Arrays.asList(Arrays.asList("eat", "tea", "ate"),
        Arrays.asList("tan", "nat"),
            Arrays.asList("bat")),
        groupAnagrams.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
  }

  @Test
  public void test2() {
    assertEquals(Arrays.asList(Arrays.asList("")),
        groupAnagrams.groupAnagrams(new String[] {""}));
  }

  @Test
  public void test3() {
    assertEquals(Arrays.asList(Arrays.asList("a")),
        groupAnagrams.groupAnagrams(new String[] {"a"}));
  }
}
