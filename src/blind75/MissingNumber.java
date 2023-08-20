package blind75;

import utils.InputDataReader;

public class MissingNumber {

    public static int missingNumber(int nums[]){
        int result = nums.length;
        for(int i=0;i<nums.length;i++){
            result = result ^ i ^ nums[i];
        }
        return result;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int arr[] = inputDataReader.readIntArr();

        System.out.println(missingNumber(arr));
    }
}
