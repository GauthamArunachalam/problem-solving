package leetcode;

import utils.InputDataReader;

public class L136SingleNumber {

    public static int singleNumber(int[] nums){
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int nums[] = inputDataReader.readIntArr();

        System.out.println(singleNumber(nums));
    }
}
