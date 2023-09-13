package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleBinaryTreeImpl;

import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public static void main(String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] treeInput = inputDataReader.readWrapperIntArr();

        SimpleBinaryTreeImpl<Integer> tree = new SimpleBinaryTreeImpl<Integer>(treeInput);
        List<List<Integer>> ans = tree.getLevelOrderTraversal();
        for (List<Integer> levelList : ans) {
            for (Integer val : levelList) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
