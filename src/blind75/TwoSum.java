package blind75;

import utils.InputDataReader;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] arr, int targetSum){

        Map<Integer, Integer> inverseMap = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            int inverseValue = targetSum - arr[i];
            if(inverseMap.containsKey(inverseValue)){
                return new int[]{inverseMap.get(inverseValue), i};
            }
            inverseMap.put(arr[i], i);
        }

        return new int[]{};
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int arr[] = inputDataReader.readIntArr();
        int targetSum = inputDataReader.readSingleInt();

        int[] ans = twoSum(arr, targetSum);
        for(int i=0;i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
