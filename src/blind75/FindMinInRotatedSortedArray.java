package blind75;

import utils.InputDataReader;

public class FindMinInRotatedSortedArray {

    public static int findMin(int[] nums){
        int low = 0, high = nums.length-1;

        while(low<=high){
            if(nums[low] <= nums[high]){
                return nums[low];
            }
            int mid = (low + high) /2;
            if(nums[mid] >= nums[low]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return 0;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int nums[] = inputDataReader.readIntArr();

        System.out.println(findMin(nums));
    }
}
