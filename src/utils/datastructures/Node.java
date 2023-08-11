package utils.datastructures;

public abstract class Node <T>{

    private T value;

    protected Node(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}
