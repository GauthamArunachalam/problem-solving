package leetcode;

import utils.InputDataReader;

public class L58LengthOfLastWord {

    public static int lengthOfLastWord(String s){
        int index = s.length() - 1;
        while(s.charAt(index) == ' '){
            index--;
        }
        int end = index;
        while(index >= 0 && s.charAt(index) != ' '){
            index--;
        }
        return end - index;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String input = inputDataReader.readStringFullLine();

        System.out.println(lengthOfLastWord(input));
    }
}
