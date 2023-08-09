package blind75;

import utils.InputDataReader;

import java.util.Scanner;

public class ProductOfArrExceptSelf {

    public static int[] productExceptSelf(int[] nums){
        int ans[] = new int[nums.length];
        ans[0] = 1;
        for(int i=1;i<nums.length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int product = 1;
        for(int j=nums.length-1; j>=0;j--){
            ans[j] = ans[j] * product;
            product = product * nums[j];
        }
        return ans;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int arr[] = inputDataReader.readIntArr();

        int ans[] = productExceptSelf(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(ans[i]);
        }
    }
}
