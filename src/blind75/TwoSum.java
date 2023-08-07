package blind75;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        int n, targetSum;

        System.out.println("Enter the number of elements : ");
        n = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+ (i+1)+" element : ");
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter target sum : ");
        targetSum = scan.nextInt();

        int[] ans = twoSum(arr, targetSum);
        for(int i=0;i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
