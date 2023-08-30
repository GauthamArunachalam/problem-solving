package leetcode;

import utils.InputDataReader;

public class L1108DefangingIPAddr {

    public static String defangIPAddr(String addr){
        StringBuilder strBul = new StringBuilder();

        for(int i=0;i<addr.length();i++){
            if(addr.charAt(i) == '.'){
                strBul.append("[.]");
            }else{
                strBul.append(addr.charAt(i));
            }
        }
        return strBul.toString();
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        String address = inputDataReader.readSingleString();

        System.out.println(defangIPAddr(address));
    }
}
