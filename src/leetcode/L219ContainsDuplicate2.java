package leetcode;

import utils.InputDataReader;

import java.util.HashSet;
import java.util.Set;

public class L219ContainsDuplicate2 {

  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> subSet = new HashSet<>();
    int leftPt = 0, rightPt = 0;

    while (rightPt < nums.length) {
      if ((rightPt - leftPt) > k) {
        subSet.remove(nums[leftPt]);
        leftPt++;
      }

      if (subSet.contains(nums[rightPt])) {
        return true;
      }
      subSet.add(nums[rightPt]);
      rightPt++;
    }

    return false;
  }

  public static void main(String args[]) {
    InputDataReader inputDataReader = new InputDataReader();
    int[] nums = inputDataReader.readIntArr();
    int k = inputDataReader.readSingleInt();


  }
}
