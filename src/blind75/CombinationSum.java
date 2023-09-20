package blind75;

import utils.InputDataReader;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void backtrack(int[] arr, int target, int index, List<List<Integer>> ans, List<Integer> current) {
        if (target == 0) {
            ans.add(new ArrayList(current));
        }
        else if (target < 0 || index >= arr.length) {
            return;
        } else {
            current.add(arr[index]);
            backtrack(arr, target - arr[index], index, ans, current);
            current.remove(current.get(current.size() - 1));
            backtrack(arr, target, index + 1, ans, current);
        }
    }

    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        backtrack(arr, target, 0, ans, current);
        return ans;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] arr = inputDataReader.readIntArr();
        int target = inputDataReader.readSingleInt();
        List<List<Integer>> ans =combinationSum(arr, target);
        for (List<Integer> solutionCombi : ans) {
            for (Integer val : solutionCombi) {
                System.out.print(val +" ");
            }
            System.out.println();
        }
    }
}
