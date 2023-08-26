package leetcode;

import utils.InputDataReader;

public class L344ReverseString {

    public static char[] reverseString(char[] s){
        int i=0, j=s.length-1;

        while (i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

        return s;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        char[] s = inputDataReader.readCharArr();

        System.out.println(new String(reverseString(s)));
    }
}
