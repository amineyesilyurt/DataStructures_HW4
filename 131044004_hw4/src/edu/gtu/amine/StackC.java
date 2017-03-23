package edu.gtu.amine;

/**
 * Created by Amine on 20/03/2017.
 */
public class StackC<E> implements StackInterface {

    NodeList stack= new NodeList<>();

    public StackC() {

    }
    /**
     *
     * @return  int size of the stack
     */
    @Override
    public int size() {
        return stack.size();
    }

    /**
     *
     * @return boolean ,if stack is empty returns true otherwise returns false
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     *
     * @return String of stack elements as the comma seperated form
     */
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer(stack.toString());

        return str.toString();
    }


    /**
     * Adds an item to the top of a stack.
     * pre item is the item to be added.
     * post If insertion is successful, item  is on the top of the stack
     * @param item Adds an item to the top of a stack
     */
    @Override
    public void push(Object item){
        stack.addFirst(item);
    }

    /**
     * Removes the top of a stack
     * pre None
     * post If the stack is not empty, the item that was added most recently is removed from the stack and returned.
     * @return E the item that was added most recently is removed from the stack
     * @throws Exception  Throws Exception if the stack is empty.
     */
    @Override
    public Object pop() throws Exception {

        if(isEmpty())
            throw new Exception("Stack is empty!");
        else
            return stack.removeFirst();
    }


}
