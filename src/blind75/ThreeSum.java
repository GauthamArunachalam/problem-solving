package blind75;

import utils.InputDataReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i=0;i<nums.length;i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int target = 0 - nums[i];
            int left = i + 1, right = nums.length-1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int nums[] = inputDataReader.readIntArr();

        List<List<Integer>> ans = threeSum(nums);
        for (List<Integer> triplets : ans) {
            for (Integer val : triplets) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
