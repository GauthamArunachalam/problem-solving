package leetcode;

import utils.InputDataReader;

public class L392IsSubsequence {

    public static boolean isSubSequence(String s, String t){
        if ((s.length() > t.length())) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        int sInd = 0, tInd = 0;
        while (sInd < s.length() && tInd < t.length()) {
            if (s.charAt(sInd) == t.charAt(tInd)){
                sInd++;
                if (sInd == s.length()) {
                    return true;
                }
            }
            tInd++;
        }

        return false;
    }


    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String s = inputDataReader.readSingleString();
        String t = inputDataReader.readSingleString();

        System.out.println(isSubSequence(s, t));
    }
}
