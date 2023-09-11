package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleLinkedListImpl;

public class RemoveNthNodeFromEndList {

    public static void main (String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] list = inputDataReader.readWrapperIntArr();

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<Integer>(list);
        int nodeCountFromLast = inputDataReader.readSingleInt();
        linkedList.removeNthNodeFromLast(nodeCountFromLast);
        System.out.println(linkedList.toString());
    }
}
