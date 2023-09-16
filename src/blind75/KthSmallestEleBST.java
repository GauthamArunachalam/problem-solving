package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleBinarySearchTreeImpl;

public class KthSmallestEleBST {

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] treeInput = inputDataReader.readWrapperIntArr();
        int k = inputDataReader.readSingleInt();

        SimpleBinarySearchTreeImpl<Integer> bst = new SimpleBinarySearchTreeImpl<Integer>(treeInput);
        System.out.println(bst.getKthSmallestEle(k));
    }
}
