package blind75;

import utils.InputDataReader;

import java.util.*;

public class ValidParentheses {

    public static class SimpleStackImpl<T>{

        private List<T> stack;

        public SimpleStackImpl(){
            stack = new LinkedList<T>();
        }

        public void push(T c){
            stack.add(c);
        }

        public T pop(){
            T c = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return c;
        }

        public T peek(){
            return stack.get(stack.size()-1);
        }

        public boolean isEmpty(){
            return stack.size() == 0;
        }
    }

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
