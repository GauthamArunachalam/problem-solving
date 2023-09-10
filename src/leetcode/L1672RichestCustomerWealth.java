package leetcode;

import utils.InputDataReader;

public class L1672RichestCustomerWealth {

    public static int maximumWeath(int[][] accounts) {
        int max = 0, sum;

        for (int[] row : accounts) {
            sum = 0;
            for (int balance : row) {
                sum += balance;
            }
            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int[][] accounts = inputDataReader.read2DIntArr();

        System.out.println(maximumWeath(accounts));
    }
}
