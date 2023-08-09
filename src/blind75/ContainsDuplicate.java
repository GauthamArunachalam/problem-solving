package blind75;

import utils.InputDataReader;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] elements){
        Set<Integer> uniqueElements = new HashSet<Integer>();
        for(int i=0; i<elements.length; i++){
            if(!uniqueElements.add(elements[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int arr[] = inputDataReader.readIntArr();

        System.out.println(containsDuplicate(arr));
    }
}
