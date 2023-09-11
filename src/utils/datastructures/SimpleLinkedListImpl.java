package utils.datastructures;


import java.util.List;

public class SimpleLinkedListImpl<T extends Comparable<T>> {

    private ListNode<T> head;

    private ListNode<T> tail;

    private int size;

    public SimpleLinkedListImpl(){
        this.size = 0;
    }

    public SimpleLinkedListImpl(T arr[]){
        if(arr.length > 0){
            for(int i=0; i<arr.length; i++){
                addNode(arr[i]);
            }
        }
    }

    public ListNode<T> getHead(){
        return this.head;
    }

    public void addNode(T value){
        ListNode<T> tempNode = new ListNode<T>(value);

        if (head == null){
            this.head = this.tail = tempNode;
        }else{
            this.tail.setNext(tempNode);
            this.tail = tempNode;
        }
        this.size++;
    }

    public int getSize(){
        return this.size;
    }

    private ListNode<T> reverseItem(ListNode<T> node){
        if(node.getNext() == null){
            return node;
        }
        ListNode<T> head = node;
        ListNode<T> newHead = reverseItem(node.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    private void updateTail(){
        ListNode<T> temp = getHead();
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        this.tail = temp;
    }

    public void reverseRecursively(){
        ListNode<T> head = getHead();
        this.head = reverseItem(head);
        updateTail();
    }

    public void reverseIteratively(){

        ListNode<T> current = getHead(), prev = null, temp = null;
        this.tail = current;
        while(current != null){
            temp = current.getNext();
            current.setNext(prev);
            prev = current;
            current = temp;
        }

        System.out.println("last ele " + prev.getValue() + " " + prev.getNext());

        this.head = prev;
    }

    public String toString(){
        StringBuilder strB = new StringBuilder();
        ListNode<T> temp = getHead();
        while (temp != null){
            strB.append(temp.getValue());
            strB.append("->");
            temp = (ListNode<T>) temp.getNext();
        }
        return strB.toString();
    }

    public void mergeSortedList(SimpleLinkedListImpl<T> list2){
        if(list2.getHead() == null){
            return;
        }

        ListNode<T> currentNode = null;
        ListNode<T> list1Pt = getHead();
        ListNode<T> list2Pt = list2.getHead();

        if(list1Pt == null){
            this.head = list2Pt;
            updateTail();
        }

        if(list1Pt.compareTo(list2Pt) > 0){
            currentNode = list2Pt;
            list2Pt = list2Pt.getNext();
        }else{
            currentNode = list1Pt;
            list1Pt = list1Pt.getNext();
        }

        while(list1Pt != null || list2Pt != null){
            if(list1Pt == null){
                currentNode.setNext(list2Pt);
                return;
            }

            if(list2Pt == null){
                currentNode.setNext(list1Pt);
                return;
            }

            if(list1Pt.compareTo(list2Pt) > 0){
                currentNode.setNext(list2Pt);
                list2Pt = list2Pt.getNext();
            }else{
                currentNode.setNext(list1Pt);
                list1Pt = list1Pt.getNext();
            }
            currentNode = currentNode.getNext();
        }
        updateTail();
    }

    public boolean isCyclic(){
        ListNode<T> slow = getHead(), fast = getHead();

        while(fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public void linkTailToHead(){
        this.tail.setNext(this.head);
    }

    public void reOrderList () {
        ListNode<T> slow = this.head;
        ListNode<T> fast = this.head.getNext();

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        ListNode<T> secondListPt = slow.getNext();
        slow.setNext(null);
        ListNode<T> previousNode = null;
        while (secondListPt != null) {
            ListNode<T> temp = secondListPt.getNext();
            secondListPt.setNext(previousNode);
            previousNode = secondListPt;
            secondListPt = temp;
        }

        ListNode<T> frontHeader = this.head;
        ListNode<T> backPt = previousNode;
        while (backPt != null) {
            ListNode<T> frontTemp = frontHeader.getNext();
            ListNode<T> backTemp = backPt.getNext();
            frontHeader.setNext(backPt);
            backPt.setNext(frontTemp);
            frontHeader = frontTemp;
            backPt = backTemp;
        }
    }

    public void removeNthNodeFromLast (int nodeCountFromLast) {
        if (this.head.getNext() == null) {
            this.head = null;
            return;
        }
        ListNode<T> left = new ListNode<T>(null);
        left.setNext(this.head);
        ListNode<T> right = this.head;
        while (nodeCountFromLast > 0) {
            right = right.getNext();
            nodeCountFromLast--;
        }

        while (right != null) {
            left = left.getNext();
            right = right.getNext();
        }

        left.setNext(left.getNext().getNext());
    }
}
