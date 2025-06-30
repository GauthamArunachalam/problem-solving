package org.gautham.leetcode.neetcode75;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {

  private final ValidAnagram validAnagram = new ValidAnagram();

  @Test
  public void diffSize(){
    assertEquals(false, validAnagram.isAnagram("asdf", "zxcvb"));
  }

  @Test
  public void invalidAnagram(){
    assertEquals(false, validAnagram.isAnagram("asdf", "qwer"));
  }

  @Test
  public void validAnagram1(){
    assertEquals(true, validAnagram.isAnagram("anagram", "nagaram"));
  }

  @Test
  public void invalidAnagram2(){
    assertEquals(false, validAnagram.isAnagram("rat", "car"));
  }
}
