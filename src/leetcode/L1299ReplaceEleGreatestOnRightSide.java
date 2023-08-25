package leetcode;

import utils.InputDataReader;

public class L1299ReplaceEleGreatestOnRightSide {

    public static int[] replaceElements(int[] nums){
        int max = -1;
        for(int i=nums.length -1; i>=0; i--){
            int newMax = Math.max(max, nums[i]);
            nums[i] = max;
            max = newMax;
        }
        return nums;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int nums[] = inputDataReader.readIntArr();

        int ans[] = replaceElements(nums);
        for(int i=0;i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
