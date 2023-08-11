package blind75;

import utils.Converters;
import utils.InputDataReader;
import utils.datastructures.SimpleLinkedListImpl;

public class LinkedListCycle {

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int arr[] = inputDataReader.readIntArr();

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<Integer>(Converters.convertPrimitiveToWrapper(arr));
        linkedList.linkTailToHead();
        System.out.println(linkedList.isCyclic());
    }
}
