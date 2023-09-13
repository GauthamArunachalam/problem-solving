package utils.datastructures;

import java.util.*;

public class SimpleBinaryTreeImpl<T extends Comparable<T>> {

    private BinaryTreeNode<T> root;

    public SimpleBinaryTreeImpl(){

    }

    public SimpleBinaryTreeImpl(BinaryTreeNode<T> root){
        this.root = root;
    }

    public SimpleBinaryTreeImpl(T arr[]){
        this.root = new BinaryTreeNode<T>(arr[0]);
        constructBinaryTree(this.root, arr, 0);
    }

    public BinaryTreeNode<T> getRoot(){
        return this.root;
    }

    public void constructBinaryTree(BinaryTreeNode<T> node, T arr[], int currentIndex){
        int leftPos = (2 * currentIndex) + 1;
        int rightPos = (2 * currentIndex) + 2;

        if(leftPos < arr.length){
            if (arr[leftPos] != null) {
                BinaryTreeNode<T> leftNode = new BinaryTreeNode<T>(arr[leftPos]);
                node.setLeft(leftNode);
                constructBinaryTree(leftNode, arr, leftPos);
            }
        }

        if(rightPos < arr.length){
            if (arr[rightPos] != null) {
                BinaryTreeNode<T> rightNode = new BinaryTreeNode<T>(arr[rightPos]);
                node.setRight(rightNode);
                constructBinaryTree(rightNode, arr, rightPos);
            }
        }
    }

    public void preOrderTraversal(){
        printPreOrder(this.root);
    }

    private void printPreOrder(BinaryTreeNode<T> node){
        if(node == null){
            return;
        }
        System.out.print(node.getValue() + " -> ");
        printPreOrder(node.getLeft());
        printPreOrder(node.getRight());
    }

    public void inOrderTraversal(){
        printInOrder(this.root);
    }

    private void printInOrder(BinaryTreeNode<T> node){
        if(node == null){
            return;
        }
        printInOrder(node.getLeft());
        System.out.print(node.getValue() + " -> ");
        printInOrder(node.getRight());
    }

    public void postOrderTraversal(){
        printPostOrder(this.root);
    }

    private void printPostOrder(BinaryTreeNode<T> node){
        if(node == null){
            return;
        }
        printPostOrder(node.getLeft());
        printPostOrder(node.getRight());
        System.out.println(node.getValue() + " -> ");
    }

    public List<List<T>> getLevelOrderTraversal() {
        BinaryTreeNode<T> node = this.getRoot();
        List<List<T>> ans = new ArrayList<List<T>>();
        LinkedList<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<T> level = new ArrayList<T>();
            for (int i=0; i<len;i++) {
                BinaryTreeNode<T> val = queue.pop();
                if (val != null) {
                    level.add(val.getValue());
                    queue.add(val.getLeft());
                    queue.add(val.getRight());
                }
            }
            if (!level.isEmpty()) {
                ans.add(level);
            }
        }
        return ans;
    }

    public void invertBinaryTree(){
        invertChildNodes(this.root);
    }

    private void invertChildNodes(BinaryTreeNode<T> node){
        if(node == null){
            return;
        }
        invertChildNodes(node.getLeft());
        invertChildNodes(node.getRight());

        BinaryTreeNode<T> temp = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);
    }

    public int getMaxDepth(){
        if(this.root == null){
            return 0;
        }

        return calcualateMaxDepth(this.root, 1);
    }

    private int calcualateMaxDepth(BinaryTreeNode<T> node, int depth){
        if(node == null){
            return depth - 1;
        }

        int leftDepth = calcualateMaxDepth(node.getLeft(), depth+1);
        int rightDepth = calcualateMaxDepth(node.getRight(), depth + 1);

        return Math.max(leftDepth, rightDepth);
    }

    public boolean isSame(SimpleBinaryTreeImpl<T> that){
        return isSame(this.root, that.getRoot());
    }

    private boolean isSame(BinaryTreeNode<T> node1, BinaryTreeNode<T> node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        return node1.compareTo(node2) ==0 && isSame(node1.getLeft(), node2.getLeft()) && isSame(node1.getRight(), node2.getRight());
    }

    public boolean isSubTree(SimpleBinaryTreeImpl<T> subTree){
        return isSubTree(this.root, subTree.getRoot());
    }

    private boolean isSubTree(BinaryTreeNode<T> tree, BinaryTreeNode<T> subTree){
        if(subTree == null){
            return true;
        }
        if(tree == null){
            return false;
        }

        if(isSame(tree, subTree)){
            return true;
        }

        return isSubTree(tree.getLeft(), subTree) || isSubTree(tree.getRight(), subTree);
    }
}
