package blind75;

import utils.InputDataReader;

public class NoOf1Bits {

    public static int hammingWeight(int n){
        int count = 0;
        int mask = 1;
        for(int i=0;i<32;i++){
            if((n & mask) != 0){
                count++;
            }
            n >>=1;
        }
//        while (n > 0){
//            n = n & (n-1);
//            count++;
//        }

        return count;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int n = inputDataReader.readSingleInt();

        System.out.println(hammingWeight(n));
    }
}
