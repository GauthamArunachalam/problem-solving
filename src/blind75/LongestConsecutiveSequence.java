package blind75;

import utils.InputDataReader;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    private static int longestConsecutive(int[] nums){
        Set<Integer> numSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            numSet.add(nums[i]);
        }

        int maxLen = 0;
        for(int i=0; i<nums.length;i++){
            int length = 0;
            if(!numSet.contains(nums[i] - 1)){
                length++;
                int checkVal = nums[i] + 1;
                while (numSet.contains(checkVal)){
                    length++;
                    checkVal++;
                }
                if(maxLen < length){
                    maxLen = length;
                }
            }
        }
        return maxLen;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int arr[] = inputDataReader.readIntArr();

        System.out.println(longestConsecutive(arr));
    }
}
