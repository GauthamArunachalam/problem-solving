package blind75;

import utils.InputDataReader;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int val : nums) {
            if (sum < 0) {
                sum = 0;
            }
            sum += val;
            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        System.out.println(maxSubArray(nums));
    }
}
