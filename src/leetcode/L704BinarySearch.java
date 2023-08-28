package leetcode;

import utils.InputDataReader;

public class L704BinarySearch {

    public static int search(int nums[], int target){
        int l=0, r=nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int nums[] = inputDataReader.readIntArr();
        int target = inputDataReader.readSingleInt();

        System.out.println(search(nums, target));
    }
}
