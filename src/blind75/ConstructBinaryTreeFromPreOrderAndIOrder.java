package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleBinaryTreeImpl;

import java.util.List;

public class ConstructBinaryTreeFromPreOrderAndIOrder {

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] preOrder = inputDataReader.readWrapperIntArr();
        Integer[] inOrder = inputDataReader.readWrapperIntArr();
        SimpleBinaryTreeImpl<Integer> binaryTree = new SimpleBinaryTreeImpl<Integer>();
        binaryTree = binaryTree.constructTree(preOrder, inOrder);
        binaryTree.postOrderTraversal();
    }
}
