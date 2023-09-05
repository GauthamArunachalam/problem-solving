package leetcode;

import utils.InputDataReader;

public class L167TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int left=0, right=numbers.length-1;
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[2];
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int numbers[] = inputDataReader.readIntArr();
        int target = inputDataReader.readSingleInt();

        int ans[] = twoSum(numbers, target);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
