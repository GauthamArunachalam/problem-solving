package blind75;

import utils.Converters;
import utils.InputDataReader;
import utils.datastructures.SimpleLinkedListImpl;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        int[] arr = inputDataReader.readIntArr();

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<Integer>(Converters.convertPrimitiveToWrapper(arr));
        //linkedList.reverseIteratively();
        linkedList.reverseRecursively();
        System.out.println(linkedList.toString());
    }
}
