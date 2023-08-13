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

        return calcualteMaxDepth(this.root, 1);
    }

    private int calcualteMaxDepth(BinaryTreeNode<T> node, int depth){
        if(node == null){
            return depth - 1;
        }

        int leftDepth = calcualteMaxDepth(node.getLeft(), depth+1);
        int rightDepth = calcualteMaxDepth(node.getRight(), depth + 1);

        return Math.max(leftDepth, rightDepth);
    }
}
