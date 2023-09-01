package leetcode;

import utils.InputDataReader;

public class L709ToLowerCase {

    public static String toLowerCase(String s){
        return s.toLowerCase();
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String s = inputDataReader.readSingleString();

        System.out.println(toLowerCase(s));
    }
}
