package edu.gtu.amine;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Amine on 21/03/2017.
 */
public class StackD<E> implements StackInterface{

    Queue queue = new LinkedList<>();
    Queue tempQueue = new LinkedList<>();

    /**
     * Adds an item to the top of a stack.
     * pre item is the item to be added.
     * post If insertion is successful, item  is on the top of the stack
     * @param item Adds an item to the top of a stack
     */
    @Override
    public void push(Object item){
        queue.add(item);
    }

    /**
     *
     * @return  int size of the stack
     */
    @Override
    public int size() {
        return queue.size();
    }


    /**
     *
     * @return String of stack elements as the comma seperated form
     */
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer(queue.toString());
        str.deleteCharAt(0);
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }

    /**
     *
     * @return boolean ,if stack is empty returns true otherwise returns false
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }



    // Removes the top of a stack.
    // Precondition: None.
    // Postcondition: If the stack is not empty, the item
    // that was added most recently is removed from the
    // stack and returned.
    // Exception: Throws Exception if the stack is
    // empty.
    @Override
    public E pop() throws Exception{
        if(queue.size() < 1){
            throw new Exception("Nothing to pop");
        }

        while (queue.size()>1) {
            tempQueue.add(queue.poll());
        }
        E item= (E) queue.poll();
        queue = tempQueue;
        tempQueue = new LinkedList<>();
        return item;
    }
}
