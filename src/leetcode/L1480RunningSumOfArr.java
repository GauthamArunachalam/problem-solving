package leetcode;

import utils.InputDataReader;

public class L1480RunningSumOfArr {

    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
       for (int i=1; i<nums.length;i++) {
           sum += nums[i];
           nums[i] = sum;
       }
        return nums;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        int ans[] = runningSum(nums);
        for (int val : ans) {
            System.out.println(val + " ");
        }
    }
}
