package utils.datastructures;

public class ListNode<T> extends Node{

    private Node next;

    public ListNode(T value){
        super(value);
    }

    public ListNode(T value, Node next){
        super(value);
        this.next = next;
    }

    public ListNode<T> getNext(){
        return (ListNode<T>) this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
