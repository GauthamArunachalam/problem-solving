package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleStackImpl;

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String str){
        Map<Character, Character> partenthesesMap = new HashMap<Character, Character>();
        partenthesesMap.put('}', '{');
        partenthesesMap.put(')', '(');
        partenthesesMap.put(']', '[');

        SimpleStackImpl<Character> stackImp = new SimpleStackImpl<Character>();
        for(Character c : str.toCharArray()){
            if(Arrays.asList('{', '[', '(').contains(c)){
                stackImp.push(c);
                continue;
            }

            if(partenthesesMap.containsKey(c)){
                if(!stackImp.isEmpty() && partenthesesMap.get(c).equals(stackImp.peek())){
                    stackImp.pop();
                }else{
                    return false;
                }
            }
        }

        return stackImp.isEmpty();
    }
    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String inputStr = inputDataReader.readSingleString();

        System.out.println(isValid(inputStr));
    }
}
