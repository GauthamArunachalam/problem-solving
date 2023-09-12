package blind75;

import utils.InputDataReader;
import utils.datastructures.SimpleBinarySearchTreeImpl;

import javax.swing.tree.TreeNode;

public class LowestCommonAncestorOfBST {

    public static void main (String args[]) {
        InputDataReader inputDataReader = new InputDataReader();
        Integer[] treeInput = inputDataReader.readWrapperIntArr();
        int p = inputDataReader.readSingleInt();
        int q = inputDataReader.readSingleInt();

        SimpleBinarySearchTreeImpl<Integer> bst = new SimpleBinarySearchTreeImpl<Integer>(treeInput);
        System.out.println(bst.lowestCommonAncestor(p, q));
    }
}
