package utils.datastructures;

public abstract class Node <T extends Comparable<T>>{

    private T value;

    protected Node(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public int compareTo(Node<T> that){
        return this.value.compareTo(that.getValue());
    }
}
