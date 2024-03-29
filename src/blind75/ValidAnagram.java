package blind75;

import utils.InputDataReader;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> charsMap= new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++){
            char si = s.charAt(i);
            if(charsMap.containsKey(si)){
                int val = charsMap.get(si) + 1;
                if(val == 0){
                    charsMap.remove(si);
                }else{
                    charsMap.put(si, val);
                }
            }else{
                charsMap.put(si, 1);
            }

            char ti = t.charAt(i);
            if(charsMap.containsKey(ti)){
                int val = charsMap.get(ti) - 1;
                if(val == 0){
                    charsMap.remove(ti);
                }else{
                    charsMap.put(ti, val);
                }
            }else{
                charsMap.put(ti, -1);
            }
        }

        return charsMap.isEmpty();
    }

    public static void main(String args[]){
        InputDataReader inputReader = new InputDataReader();
        String s = inputReader.readSingleString();
        String t = inputReader.readSingleString();

        System.out.println(isAnagram(s, t));
    }
}
