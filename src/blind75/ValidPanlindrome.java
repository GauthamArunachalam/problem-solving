package blind75;

import utils.InputDataReader;


public class ValidPanlindrome {

    public static boolean isAlphaNumeric(char c){
        if((c >=48 && c <=57) || (c >=65 && c <= 90) || (c >= 97 && c <= 122)){
            return true;
        }
        return false;
    }

    public static boolean isPanlindrome(String input){
        char[] inputValue = input.toCharArray();
        int i = 0, j=inputValue.length-1;

        while(i<j){
            if(!isAlphaNumeric(inputValue[i])){
                i++;
                continue;
            }
            if(!isAlphaNumeric(inputValue[j])){
                j--;
                continue;
            }

            if(inputValue[i] >=65 && inputValue[i]<=90){
                inputValue[i] = (char)(inputValue[i] + 32);
            }

            if(inputValue[j] >= 65 && inputValue[j] <= 90){
                inputValue[j] = (char) (inputValue[j] + 32);
            }

            if(inputValue[i] != inputValue[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]){
        InputDataReader inputReader = new InputDataReader();
        String input = inputReader.readStringFullLine();

        System.out.println(isPanlindrome(input));
    }
}
