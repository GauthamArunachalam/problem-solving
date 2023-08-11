package blind75;

import utils.Converters;
import utils.InputDataReader;
import utils.datastructures.SimpleLinkedListImpl;

public class Merge2SortedList {

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();

        int arr1[] = inputDataReader.readIntArr();
        int arr2[] = inputDataReader.readIntArr();

        SimpleLinkedListImpl<Integer> list1 = new SimpleLinkedListImpl<Integer>(Converters.convertPrimitiveToWrapper(arr1));
        SimpleLinkedListImpl<Integer> list2 = new SimpleLinkedListImpl<Integer>(Converters.convertPrimitiveToWrapper(arr2));

        list1.mergeSortedList(list2);
        System.out.println(list1.toString());
    }
}
