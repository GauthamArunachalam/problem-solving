package leetcode;

import utils.InputDataReader;

public class L1456MaxNoOfVowelSubStrOfLen {

  public static boolean isVowel(char ch) {
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
  }

  public static int maxVowels(String s, int k) {
    int retVal = 0;
    int countOfVowels = 0, leftPt = 0, rightPt = 0, size = s.length();

    while (rightPt < size) {
      if (isVowel(s.charAt(rightPt))) {
        countOfVowels++;
      }

      if (k == (rightPt - leftPt) + 1) {
        if (retVal < countOfVowels) {
          retVal = countOfVowels;
        }

        if (isVowel(s.charAt(leftPt))) {
          countOfVowels--;
        }
        leftPt++;
      }
      rightPt++;
    }

    return retVal;
  }

  public static void main(String[] args) {
    InputDataReader in = new InputDataReader();
    String s = in.readSingleString();
    int k = in.readSingleInt();

    System.out.println(maxVowels(s, k));
  }
}
