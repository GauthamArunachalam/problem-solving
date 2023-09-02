package leetcode;

import utils.InputDataReader;

public class L14LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<strs[0].length(); i++){
            for(String str : strs){
                if(i == str.length() || str.charAt(i) != strs[0].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String[] strs = inputDataReader.readStringArr();

        System.out.println(longestCommonPrefix(strs));
    }
}
