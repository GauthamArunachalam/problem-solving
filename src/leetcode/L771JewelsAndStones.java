package leetcode;

import utils.InputDataReader;

import java.util.HashSet;
import java.util.Set;

public class L771JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones){
        Set<Character> jewelName = new HashSet<Character>();
        for(Character c : jewels.toCharArray()){
            jewelName.add(c);
        }

        int res = 0;
        for(Character s : stones.toCharArray()){
            if(jewelName.contains(s)){
                res++;
            }
        }
        return res;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String jewel = inputDataReader.readSingleString();
        String stones = inputDataReader.readSingleString();

        System.out.println(numJewelsInStones(jewel, stones));
    }
}
