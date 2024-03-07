package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

    private ArrayList<E> delegate;
    private int size;

    public MyStack() {
        delegate = new ArrayList<>();
        size=0;
    }

    public void push(E e) {
        delegate.add(e);
        size++;
    }

    public E pop() {
        if (delegate.isEmpty())
            throw new EmptyStackException();
        size--;
        E e =delegate.get(size);
        delegate.remove(size);

        return e;
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }

}
