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
        assertTrue(myStack.isEmpty());
       myStack.push(1);
       assertFalse(myStack.isEmpty());
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
        assertEquals(0,myStack.size());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertEquals(3,myStack.size());
        assertEquals(Integer.valueOf(3), myStack.pop());
        assertEquals(2,myStack.size());

    }

}
