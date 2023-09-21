package leetcode;

import utils.InputDataReader;

import java.util.ArrayList;
import java.util.List;

public class L1431KidsWithGreatestNoOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = Integer.MIN_VALUE;
        for (int val : candies) {
            if (val > max) {
                max = val;
            }
        }

        for (int val : candies) {
            if ((val + extraCandies) >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] candies = inputDataReader.readIntArr();
        int extraCandies = inputDataReader.readSingleInt();
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        for (Boolean val : ans) {
            System.out.println(val);
        }
    }
}
