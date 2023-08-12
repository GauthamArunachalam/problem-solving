package utils.datastructures;

public class BinaryTreeNode<T extends Comparable<T>> extends Node<T>{

    private BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T val){
        super(val);
    }

    public BinaryTreeNode(T val, BinaryTreeNode<T> left, BinaryTreeNode<T> right){
        super(val);
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode<T> getLeft(){
        return this.left;
    }

    public BinaryTreeNode<T> getRight(){
        return this.right;
    }

    public void setLeft(BinaryTreeNode<T> left){
        this.left = left;
    }

    public void setRight(BinaryTreeNode<T> right){
        this.right = right;
    }

    public boolean isLeafNode(){
        return this.left == null && this.right == null;
    }
}
