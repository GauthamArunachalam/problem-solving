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
        if(this.value == null && that.getValue() == null) {
            return 0;
        }
        if(this.value == null){
            return -1;
        }
        if(that.getValue() == null){
            return 1;
        }
        return this.value.compareTo(that.getValue());
    }
}
