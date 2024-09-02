package leetcode;

import utils.InputDataReader;

public class L1248CountNoOfNiceSubArr {

  public static int numberOfSubarrays(int[] nums, int k) {
    int count = 0;
    int oddCount = 0, leftPt = 0, rightPt = 0, endingCountBefore = 0;

    while (rightPt < nums.length) {
     if (nums[rightPt] % 2 == 1) {
       oddCount++;
     }

     if (oddCount >= k) {
       endingCountBefore = 0;
       while (oddCount >= k) {
         if (nums[leftPt] % 2 == 1) {
           oddCount--;
         }
         endingCountBefore++;
         leftPt++;
       }
     }

      count+=endingCountBefore;
      rightPt++;
    }

    return count;
  }

  public static void main (String[] args) {
    InputDataReader in = new InputDataReader();
    int[] nums = in.readIntArr();
    int k = in.readSingleInt();

    System.out.println(numberOfSubarrays(nums, k));
  }
}
