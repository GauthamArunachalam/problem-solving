package org.gautham.leetcode.neetcode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

  /**
   * Converts the string into a key
   * Given a string "bat" it returns the unique chars in lexical order with its count like "a1b1t1"
   * */
  private String getKey(String str) {
    int[] charCountMap = new int[26];
    StringBuffer key = new StringBuffer();
    for (char c : str.toCharArray()) {
      charCountMap[c - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
      if (charCountMap[i] != 0) {
        int c = (char)(i + 'a');
        key.append(c);
        key.append(charCountMap[i]);
      }
    }

    return key.toString();
  }

  /**
   * Given a list of strings this method will group anagrams together
   * Time Complexity : O(n * m)
   * Space Complexity : O(n * m)
   * n = number of strings
   * m = avg. length of string
   * */
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> grpWords = new HashMap<>();

    for (String str : strs) {
      String key = getKey(str);
      if (grpWords.containsKey(key)) {
        grpWords.get(key).add(str);
      } else {
        List<String> list = new ArrayList<>();
        list.add(str);
        grpWords.put(key, list);
      }
    }
    return new ArrayList<>(grpWords.values());
  }

}
