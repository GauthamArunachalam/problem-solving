package leetcode;

import utils.InputDataReader;

public class L1929ConcatenationOfArr {

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length*2];

        for(int i=0;i<nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int nums[] = inputDataReader.readIntArr();
        int ans[] = getConcatenation(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
