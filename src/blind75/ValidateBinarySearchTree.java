package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleBinarySearchTreeImpl;

public class ValidateBinarySearchTree {

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] treeInput = inputDataReader.readWrapperIntArr();

        SimpleBinarySearchTreeImpl<Integer> bst = new SimpleBinarySearchTreeImpl<Integer>(treeInput);
        System.out.println(bst.isValid());
    }
}
