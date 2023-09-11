package blind75;

import utils.InputDataReader;
import utils.datastructures.ListNode;
import utils.datastructures.SimpleLinkedListImpl;

public class ReorderList {

    public static void main (String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] list = inputDataReader.readWrapperIntArr();
        SimpleLinkedListImpl linkedList = new SimpleLinkedListImpl(list);

        linkedList.reOrderList();
        System.out.println(linkedList.toString());
    }
}
