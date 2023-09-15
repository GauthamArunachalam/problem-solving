package leetcode;

import utils.InputDataReader;

public class L2798NoOfEmpWhoMetTarget {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int val : hours) {
            if (val >= target) {
                res++;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[] hours = inputDataReader.readIntArr();
        int target = inputDataReader.readSingleInt();
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }
}
