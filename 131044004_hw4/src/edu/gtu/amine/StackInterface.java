package edu.gtu.amine;

/**
 * Created by Amine on 20/03/2017.
 */
public interface StackInterface<E> {

    //return size of the stack
    public int size();

    //return a boolean ,if stack is empty returns true otherwise returns false
    public boolean isEmpty();

    // Adds an item to the top of a stack.
    // Precondition: item is the item to be added.
    // Postcondition: If insertion is successful, item
    // is on the top of the stack.
    //returns the item argument
    public void push(Object item);



    // Removes the top of a stack.
    // Precondition: None.
    // Postcondition: If the stack is not empty, the item
    // that was added most recently is removed from the
    // stack and returned.
    // Exception: Throws Exception if the stack is
    // empty.
    public E pop() throws Exception;



}
