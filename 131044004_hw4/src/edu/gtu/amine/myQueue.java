package edu.gtu.amine;

import java.util.Queue;

/**
 * Created by Amine on 22/03/2017.
 */
public class myQueue<E> extends KWLinkedList {


    /**
     * Inserts an item at the rear of the queue.
     * @param item The element to add
     * @return true (always successful)
     */

    public boolean offer(E item) {
        add(item);
        return true;
    }


    /**
     * Removes the entry at the front of the queue and returns it.
     * @return The item removed if successful, or null if not
     */

    public E poll() {
        if (size() == 0) {
            return null;
        } else {
            return (E) removeFirst();
        }
    }

    /**
     * Returns the item at the front of the queue without removing it.
     * @return The item at the front if successful; null if not
     */
    public E peek() {
        if (size() == 0) {
            return null;
        } else {
            return (E) get(0);
        }
    }

    /**
     * reverses the queue
     */
    public void reverse(){
        int numOfswap;
        if((size()%2)==0)
            numOfswap=size()/2;
        else
            numOfswap=(size()-1)/2;
        for(int i=0; i <numOfswap;++i){
            E temp= (E) get(i);

            int j= size()-1-i;
            set(i,get(j));
            set(j,temp);
        }
    }

    /**
     * reverses the queue recursively
     * @param theQueue the queue which will to reverse recursively.
     */
   public static void reverseQueue(Queue theQueue){
       if(theQueue.size()==0)
           return;
       else {
           Object a= theQueue.remove();
           reverseQueue(theQueue);
           theQueue.add(a);

       }

   }

}
