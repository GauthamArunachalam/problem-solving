package org.gautham.leetcode.neetcode75;

import java.util.HashMap;

public class ValidAnagram {

  /**
   * Checks if the given strings are valid anagrams
   * This implementation used HashMap to get the count of all the chars in string s. Then iterates over t string chars
   * to see if they match in count if a char is not present then the count goes negative making them not an anagram
   * A safety check is added to with the length of the strings to return false at the start
   * Time Complexity : O(n + m)
   *    n - Length of s
   *    m - Length of m
   * Space Compexity : O(n + m)
   * */
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i=0;i<s.length();i++) {
      charCount.put(s.charAt(i), 1 + charCount.getOrDefault(s.charAt(i), 0));
    }

    for (int i=0;i<t.length();i++) {
      int val = charCount.getOrDefault(t.charAt(i), 0);
      val--;
      if (val < 0) {
        return false;
      }
      charCount.put(t.charAt(i), val);
    }

    return true;
  }
}
