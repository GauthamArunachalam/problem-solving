package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleBinaryTreeImpl;

public class InvertBinaryTree {

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] arr = inputDataReader.readWrapperIntArr();

        SimpleBinaryTreeImpl<Integer> binaryTree = new SimpleBinaryTreeImpl<Integer>(arr);
        binaryTree.invertBinaryTree();
        binaryTree.preOrderTraversal();
    }
}
