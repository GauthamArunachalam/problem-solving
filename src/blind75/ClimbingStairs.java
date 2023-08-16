package blind75;

import utils.InputDataReader;

public class ClimbingStairs {

    public static int climbStairs(int n){
        int firstStep=1, secondStep=1;
        for(int i=1;i<n;i++){
            int temp = secondStep;
            secondStep = firstStep + secondStep;
            firstStep = temp;
        }
        return secondStep;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int n = inputDataReader.readSingleInt();
        System.out.println(climbStairs(n));
    }
}
