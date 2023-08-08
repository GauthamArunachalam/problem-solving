package blind75;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter the "+ (i+1) +" element : ");
            arr[i] = scan.nextInt();
        }

        int ans[] = productExceptSelf(arr);
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
