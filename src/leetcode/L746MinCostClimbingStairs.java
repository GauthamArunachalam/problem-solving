package leetcode;

import utils.InputDataReader;

import java.util.Optional;

public class L746MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int include1 = 0, exclude1 = 0;
        for (int i=cost.length-1; i>=0; i--) {
            cost[i] += Math.min(include1, exclude1);
            exclude1 = include1;
            include1 = cost[i];
        }
        return Math.min(cost[0], cost[1]);
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] cost = inputDataReader.readIntArr();
        System.out.println(minCostClimbingStairs(cost));
    }
}
