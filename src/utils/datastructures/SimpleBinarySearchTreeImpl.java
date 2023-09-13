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

    //TODO - add / remove element in binary search tree

    //TODO - to check and modify construct modify binary tree to check and construct based on BST

    private T lowestCommonAncestor (BinaryTreeNode<T> root, T p, T q) {
        if (root.getValue().compareTo(p) > 0 && root.getValue().compareTo(q) > 0) {
            return lowestCommonAncestor(root.getLeft(), p, q);
        } else if (root.getValue().compareTo(p) < 0 && root.getValue().compareTo(q) < 0) {
            return lowestCommonAncestor(root.getRight(), p, q);
        }
        return root.getValue();
    }

    public boolean isValid() {
        return isValid(this.getRoot(), (T)getLowestBound(getRoot().getValue()), (T)getHighestBound(getRoot().getValue()));
    }

    private boolean isValid(BinaryTreeNode<T> node, T leftBoundry, T rightBoundry) {
        if (node == null) {
            return true;
        }

        if (!((leftBoundry != null && node.getValue().compareTo(leftBoundry) > 0) && (rightBoundry != null && node.getValue().compareTo(rightBoundry) < 0))) {
            return false;
        }

        return isValid(node.getLeft(), leftBoundry, node.getValue()) && isValid(node.getRight(), node.getValue(), rightBoundry);
    }

    private Object getLowestBound(T val) {
        if (val instanceof Integer) {
            return Integer.MIN_VALUE;
        }
        return null;
    }

    private Object getHighestBound(T val) {
        if (val instanceof  Integer) {
            return Integer.MAX_VALUE;
        }
        return null;
    }
}
