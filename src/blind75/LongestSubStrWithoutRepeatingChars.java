package blind75;

import utils.InputDataReader;

import java.util.HashSet;
import java.util.Set;


public class LongestSubStrWithoutRepeatingChars {

    public static int lengthOfLongestSubString(String s){
        int max=0;

        Set<Character> charSet = new HashSet<Character>();
        int leftRange=0, rightRange=0;
        for(int i=0; i<s.length();i++){
            if(charSet.contains(s.charAt(i))){
                if(max < rightRange-leftRange){
                    max = rightRange-leftRange;
                }

                while(charSet.contains(s.charAt(i))){
                    charSet.remove(s.charAt(leftRange));
                    leftRange++;
                }
            }
            charSet.add(s.charAt(i));
            rightRange++;
        }

        if(max < rightRange-leftRange){
            max = rightRange - leftRange;
        }


        return max;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String inputStr = inputDataReader.readSingleString();

        System.out.println(lengthOfLongestSubString(inputStr));
    }
}
