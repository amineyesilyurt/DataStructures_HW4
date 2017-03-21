package edu.gtu.amine;

class NodeList<E> {

    private static class Node<E> {

        private final E data;
        private Node<E> next;


        public Node(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<E> first = null;
    private int size=0;

    /**
     *
     * @param data will ad first
     */
    public void addFirst(E data) {
        Node<E> newFirst = new Node<E>(data);
        newFirst.next = first;
        first = newFirst;
        ++size;
    }

    /**
     *
     * @return removed item
     */
    public E removeFirst() {
        Node<E> oldFirst = first;
        first = first.next;
        --size;
        return oldFirst.data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = first;
        while (current != null) {
            builder.append(current).append(" ");
            current = current.next;
        }
        return builder.toString();
    }

    /**
     *
     * @return if list emty returns true ,otherwise false
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     *
     * @return  size of the list
     */
    public int size(){
        return  size;
    }

}
