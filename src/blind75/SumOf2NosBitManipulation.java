package blind75;

import utils.InputDataReader;

public class SumOf2NosBitManipulation {

    public static int getSum(int a, int b){
        while(b != 0){
            int temp = a;
            a = a ^ b;
            b = (temp & b) << 1;
        }
        return a;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int a = inputDataReader.readSingleInt();
        int b = inputDataReader.readSingleInt();

        System.out.println(getSum(a, b));
    }
}
