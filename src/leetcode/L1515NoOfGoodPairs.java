package leetcode;

import utils.InputDataReader;

import java.util.HashMap;
import java.util.Map;

public class L1515NoOfGoodPairs {

    public static int numIdenticalPairs (int[] nums) {
        int res = 0;
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            int freq = freqMap.getOrDefault(nums[i], 0);
            res += freq;
            freqMap.put(nums[i], freq+1);
        }
        return res;
    }

    public static void main (String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        System.out.println(numIdenticalPairs(nums));
    }
}
