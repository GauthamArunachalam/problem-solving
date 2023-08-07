package blind75;

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
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements: ");
        n = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter the "+ (i+1) +" element : ");
            arr[i] = scan.nextInt();
        }

        System.out.println(containsDuplicate(arr));
    }
}
