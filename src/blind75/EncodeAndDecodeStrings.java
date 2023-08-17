package blind75;

import utils.InputDataReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {

    public static String encode(List<String> strs){
        StringBuilder stB = new StringBuilder();

        for(String str : strs){
            stB.append(str.length());
            stB.append("#");
            stB.append(str);
        }

        return stB.toString();
    }

    public static List<String> decode(String str){
        List <String> result = new ArrayList<String>();
        int i=0;
        while ((i < str.length())){
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j+1, j+1+len));
            i = j + 1 +len;
        }
        return result;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String[] strs = inputDataReader.readStringArr();

        String encodedStr = encode(Arrays.asList(strs));

        System.out.println(encodedStr);

        List<String> decodedString = decode(encodedStr);

        for(int i=0;i<decodedString.size();i++){
            System.out.println(decodedString.get(i));
        }
    }
}
