package leetcode;

import utils.InputDataReader;

public class L35SearchInsertPosition {

    public static int searchInsert (int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (nums[high] < target) ? high + 1 : low;
    }

    public static void main (String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        int target = inputDataReader.readSingleInt();
        System.out.println(searchInsert(nums, target));
    }
}
