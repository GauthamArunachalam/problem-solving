package leetcode;

import utils.InputDataReader;

public class L2413SmallestEvenMultiple {

    public static int smallestEvenMultiple(int n) {
        return n%2 == 0 ? n : n*2;
    }

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        int n = inputDataReader.readSingleInt();
        System.out.println(smallestEvenMultiple(n));
    }
}
