package org.example;

import junit.framework.TestCase;

import java.util.EmptyStackException;

/**
 * Unit test for simple App.
 */
public class MyStackTest
    extends TestCase
{
    private MyStack<Integer> myStack;

    @Override
    protected void setUp() throws Exception {
        myStack=new MyStack<>();
    }

    public void testPush(){
       myStack.push(1);
       myStack.push(2);
       myStack.push(3);
       assertEquals(Integer.valueOf(3), myStack.pop());
    }

    public void testPop(){
        try {
            myStack.pop();
        }catch (EmptyStackException e)
        {
            assertEquals(EmptyStackException.class,e.getClass());
        }
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(Integer.valueOf(3), myStack.pop());

    }

}
