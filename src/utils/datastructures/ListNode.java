package utils.datastructures;

public class ListNode<T extends Comparable<T>> extends Node<T>{

    private Node<T> next;

    public ListNode(T value){
        super(value);
    }

    public ListNode(T value, Node<T> next){
        super(value);
        this.next = next;
    }

    public ListNode<T> getNext(){
        return (ListNode<T>) this.next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }
}
