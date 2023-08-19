package blind75;

import utils.InputDataReader;

public class ReverseBits {

    public static int reverseBit(int n){
        int result = 0;
        for(int i=0;i<32;i++){
            int bit = (n>>i) & 1;
            result = result | (bit << (31 - i));
        }
        return result;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int n = inputDataReader.readSingleInt();

        System.out.println(reverseBit(n));
    }
}
