package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleBinaryTreeImpl;

public class SubTreeOfAnotherTree {

    public static void main(String args[]){
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] arr1 = inputDataReader.readWrapperIntArr();
        Integer[] arr2 = inputDataReader.readWrapperIntArr();

        SimpleBinaryTreeImpl<Integer> tree1 = new SimpleBinaryTreeImpl<Integer>(arr1);
        SimpleBinaryTreeImpl<Integer> tree2 = new SimpleBinaryTreeImpl<Integer>(arr2);

        System.out.println(tree1.isSubTree(tree2));
    }
}
