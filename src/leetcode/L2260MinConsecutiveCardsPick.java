package leetcode;

import utils.InputDataReader;

import java.util.HashMap;
import java.util.Map;

public class L2260MinConsecutiveCardsPick {

  public static int minimumCardPickup(int[] cards) {
    int retVal = Integer.MAX_VALUE;

    Map<Integer, Integer> valToIndex = new HashMap<>();
    for (int i=0; i<cards.length; i++) {
      if (valToIndex.containsKey(cards[i])) {
        int diffCal = i - valToIndex.get(cards[i]) + 1;
        if (retVal > diffCal) {
          retVal = diffCal;
        }
      }
      valToIndex.put(cards[i], i);
    }

    return retVal == Integer.MAX_VALUE ? -1 : retVal;
  }

  public static void main(String[] args) {
    InputDataReader in = new InputDataReader();
    int[] cards = in.readIntArr();

    System.out.println(minimumCardPickup(cards));
  }
}
