package org.gautham.leetcode.neetcode75;

import java.util.HashSet;

public class LongestSubStrWithoutRepChar {

  /**
   * Longest sub string without repeating chars
   * Uses sliding window method with a hashSet
   * Time Complexity : O(n)
   * Space Complexity : O(n)
   * */
  public int lengthOfLongestSubstring(String s) {
    int retVal = 0;
    int leftPt = 0, rightPt = 0;
    HashSet<Character> uniqueChars = new HashSet<>();
    while (rightPt < s.length()) {
      if (uniqueChars.contains(s.charAt(rightPt))) {
        while(uniqueChars.contains(s.charAt(rightPt))) {
          uniqueChars.remove(s.charAt(leftPt));
          leftPt++;
        }
      }
      uniqueChars.add(s.charAt(rightPt));
      rightPt++;
      retVal = Math.max(retVal, rightPt - leftPt);
    }
    return retVal;
  }
}
