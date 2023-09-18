package blind75;

import utils.InputDataReader;

public class HouseRobber2 {

    public static int robHelper(int[] nums, int start, int end) {
        int opt1 = 0 , opt2 = 0;
        for (int i=start; i<=end; i++) {
            int temp = Math.max(nums[i] + opt1, opt2);
            opt1 = opt2;
            opt2 = temp;
        }
        return opt2;
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length-1));
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        System.out.println(rob(nums));
    }
}
