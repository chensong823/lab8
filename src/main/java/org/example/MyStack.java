package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

    private ArrayList<E> delegate;



    public MyStack() {
        delegate = new ArrayList<>();
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (isEmpty())
            throw new EmptyStackException();
        E e =delegate.get(size()-1);
        delegate.remove(size()-1);

        return e;
    }
    public int size()
    {
        return delegate.size();
    }
    public boolean isEmpty()
    {
        return delegate.isEmpty();
    }

}
