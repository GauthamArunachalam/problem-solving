package utils.datastructures;

import javax.swing.tree.TreeNode;

public class SimpleBinarySearchTreeImpl<T extends Comparable<T>> extends SimpleBinaryTreeImpl<T> {

    public SimpleBinarySearchTreeImpl() {
        super();
    }

    public SimpleBinarySearchTreeImpl(T arr[]) {
        super(arr);
    }


    public T lowestCommonAncestor (T p, T q) {
        return lowestCommonAncestor(getRoot(), p, q);
    }

    //TODO - Validate Binary search Tree

    //TODO - add element in binary search tree insert

    //TODO - to check and modify construct modify binary tree to check and construct based on BST

    private T lowestCommonAncestor (BinaryTreeNode<T> root, T p, T q) {
        if (root.getValue().compareTo(p) > 0 && root.getValue().compareTo(q) > 0) {
            return lowestCommonAncestor(root.getLeft(), p, q);
        } else if (root.getValue().compareTo(p) < 0 && root.getValue().compareTo(q) < 0) {
            return lowestCommonAncestor(root.getRight(), p, q);
        }
        return root.getValue();
    }
}
