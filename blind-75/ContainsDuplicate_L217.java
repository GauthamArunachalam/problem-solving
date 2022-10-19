import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Leet code problem number 217
 * Contains duplicate
 * Time Complexity : O(n) - In worst case we will iterate over all the list of elements
 * Space Complexity : O(n) - We will need a exta memory in the size of the array
 */
public class ContainsDuplicate_L217{

    /**
     * The methods adds the elements to a HashSet if the element exist in the hashMap then true will be returned else the elemnet will be added into the set
     */
    public static boolean containsDuplicate(int[] arrElements){
        Set<Integer> newSetObj = new HashSet<Integer>();
        for(int i=0; i<arrElements.length; i++){
            if(newSetObj.contains(arrElements[i])){
                return true;
            }
            newSetObj.add(arrElements[i]);
        }

        return false;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of elements : ");
        n = scan.nextInt();

        int [] arrElements = new int[n];
        for(int i=0; i<n; i++){
            int temp = scan.nextInt();
            arrElements[i] = temp;
        }

        System.out.println("Duplicate Status : "+ containsDuplicate(arrElements));

    }
}