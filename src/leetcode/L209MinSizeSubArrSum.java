package leetcode;

import utils.InputDataReader;

public class L209MinSizeSubArrSum {

  public static int minSubArrayLen(int target, int[] nums) {
    int retVal = Integer.MAX_VALUE;
    int leftPt = 0, rightPt = 0, sum = 0;

    while (rightPt < nums.length) {
      sum+=nums[rightPt];

      if (sum >= target) {
        if (retVal > (rightPt - leftPt + 1)) {
          retVal  = rightPt - leftPt + 1;
        }
      }

      while (sum >= target) {
        sum-=nums[leftPt];
        leftPt++;
        if (retVal > (rightPt - leftPt + 1) && sum >= target) {
          retVal = rightPt - leftPt + 1;
        }
      }
      rightPt++;
    }

    return retVal == Integer.MAX_VALUE ? 0 : retVal;
  }

  public static void main(String args[]) {
    InputDataReader in = new InputDataReader();
    int target = in.readSingleInt();
    int[] nums = in.readIntArr();

    System.out.println(minSubArrayLen(target, nums));
  }
}
