package blind75;

import utils.InputDataReader;

public class HouseRobber {

    public static int rob(int nums[]) {
        int opt1 = 0, opt2 = 0;
        for (int val : nums) {
            int temp = Math.max(val + opt1, opt2);
            opt1 = opt2;
            opt2 = temp;
        }
        return opt2;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        System.out.println(nums);
    }
}
