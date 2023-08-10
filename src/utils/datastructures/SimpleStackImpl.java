package utils.datastructures;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SimpleStackImpl <T>{

    private List<T> stack;

    private int size;

    private boolean autoResize;

    public SimpleStackImpl(){
        this(10, false);
    }

    public SimpleStackImpl(int size){
        this(size, false);
    }

    public SimpleStackImpl(int size, boolean autoResize){
        stack = new ArrayList<T>(size);
        this.autoResize = autoResize;
    }

    public void push(T ele){
        if(!autoResize && stack.size() == this.size){
            throw new StackOverflowError("Stack Overflow");
        }
        stack.add(ele);
    }

    public T peek(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }

        return stack.get(stack.size() - 1);
    }

    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }

        T ele = peek();
        stack.remove(stack.size() -1);
        return ele;
    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }

    public boolean isAutoResize(){
        return this.autoResize;
    }

    public int getSize(){
        return stack.size();
    }
}
