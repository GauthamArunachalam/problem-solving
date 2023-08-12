package utils.datastructures;

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

    public void constructBinaryTree(BinaryTreeNode<T> node, T arr[], int currentIndex){
        int leftPos = (2 * currentIndex) + 1;
        int rightPos = (2 * currentIndex) + 2;

        if(leftPos < arr.length){
            BinaryTreeNode<T> leftNode = new BinaryTreeNode<T>(arr[leftPos]);
            node.setLeft(leftNode);
            constructBinaryTree(leftNode, arr, leftPos);
        }

        if(rightPos < arr.length){
            BinaryTreeNode<T> rightNode = new BinaryTreeNode<T>(arr[rightPos]);
            node.setRight(rightNode);
            constructBinaryTree(rightNode, arr, rightPos);
        }
    }

    public void inorderTraversal(){
        printInorder(this.root);
    }

    private void printInorder(BinaryTreeNode<T> node){
        if(node == null){
            return;
        }
        System.out.print(node.getValue() + " -> ");
        printInorder(node.getLeft());
        printInorder(node.getRight());
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
}
