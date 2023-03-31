public class MyLinkedList <Type> {

    /** References the first node in the linked list. */
    protected Node first;
    /** References the current node in the linked list. */
    protected Node current;
    /** References the previous node before the current node in the linked list. */
    protected Node previous;
    /** The number of elements stored in the list. */
    protected int size;

    //*******************************************************

    public MyLinkedList() {
        first = null;
        current = null;
        previous = null;
    }

    //*******************************************************

    /** Adds the "item" before the "current" node. */
    public void addBefore(Type item) {
        // Edge Case #1: if curr is first, newNode becomes first node,
        //               curr stays at same node
        if (current == first) {
            Node newNode = new Node(item, current);
            previous = newNode;
            first = newNode;
        }
        // Edge Case #2: if the curr has fallen off the edge of the linked list,
        //               newNode is added to the last position in the list.
        //               previous pointer points to the newNode and that becomes
//                       the new current pointer position.
        else if (current == null) {
            Node newNode = new Node(item, previous);
            current = newNode;
        }
        // Edge Case #3:
        else {
            Node newNode = new Node(item, current);
            previous = newNode;
        }


    }

    public void addAfter(Type item) {
        //TODO
    }

    public Type current() {
        //TODO
        return null;
    }

    public Type first() {
        //TODO
        return null;
    }

    public Type next() {
        //TODO
        return null;
    }

    public Type remove() {
        //TODO
        return null;
    }

    public boolean contains(Type item) {
        //TODO
        return false;
    }

    /** Returns the number of elements within the linked list. */
    public int size() {
        return size;
    }

    /** Returns true if size of linked list is 0, false if otherwise. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Returns string representation of the contents of the linked list. */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String prefix = "";
        sb.append("[");
        // TODO: Still need to implement this
        sb.append("]");
        return sb.toString();
    }

    //****************************************************************

    protected class Node {
        /** The item stored within this node. */
        public Type item;
        /** A reference to the next node in the list. */
        public Node next;

        //*************************************************************

        /**
         * Constructor takes in parameter of an item and the next node to reference
         *  and sets the param values to the instance fields.
         */
        public Node(Type theItem, Node theNextNode) {
            item = theItem;
            next = theNextNode;
        }

        //*************************************************************

        /** Returns toString() of the item. */
        public String toString() {
            return item.toString();
        }

    }

}

