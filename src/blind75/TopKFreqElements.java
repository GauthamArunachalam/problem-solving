package blind75;

import utils.Converters;
import utils.InputDataReader;

import java.util.*;

public class TopKFreqElements {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqCount = new HashMap<>();
        for(int val : nums) {
            freqCount.put(val, freqCount.getOrDefault(val, 0) + 1);
        }

        Map<Integer, TreeSet<Integer>> countVal = new TreeMap<Integer, TreeSet<Integer>>(Collections.reverseOrder());
        for (int val : freqCount.keySet()) {
            if (countVal.containsKey(freqCount.get(val))) {
                countVal.get(freqCount.get(val)).add(val);
            } else {
                TreeSet<Integer> valuesArr = new TreeSet<>();
                valuesArr.add(val);
                countVal.put(freqCount.get(val), valuesArr);
            }
        }

        int[] ans = new int[k];
        int i = 0;
        for (Integer countFreq : countVal.keySet()) {
            for (Integer val : countVal.get(countFreq)) {
                ans[i] = val;
                i++;
                if (i == k){
                    return ans;
                }
            }
        }

        return new int[0];
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] nums = inputDataReader.readIntArr();
        int k = inputDataReader.readSingleInt();

        int[] ans = topKFrequent(nums, k);
        for(int val : ans){
            System.out.print(val + " ");
        }
    }
}
