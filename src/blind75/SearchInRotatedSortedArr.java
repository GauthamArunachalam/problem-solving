package blind75;

import utils.InputDataReader;

public class SearchInRotatedSortedArr {

    public static int search (int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] <= nums[mid]) {
                 if ((target > nums[mid]) || (target < nums[high])) {
                     low = mid + 1;
                 } else {
                     high = mid - 1;
                 }
            } else {
                if ((target < nums[mid]) || (target > nums[high])) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main (String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        int target = inputDataReader.readSingleInt();
        System.out.println(search(nums, target));
    }
}
