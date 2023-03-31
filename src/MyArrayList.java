public class MyArrayList <Type> {

    /** Storage for elements of the list in this array. */
    protected Type[] list;
    /** The max length of elements that can be stored in the array list. */
    protected int capacity;
    /** The number of actual elements stored in the array list. */
    protected int size;

    //**************************************************************

    public MyArrayList() {
        this.capacity = 16;
        this.list = (Type[]) new Object[capacity];
    }

    //**************************************************************

    /** Inserts the item at position index. */
    public void insert(Type item, int index) {
        if (index > size || index < 0) {
//            System.out.println("Does nothing");
        } else if (size == capacity) {
            resize();
            list[index] = item;
            size++;
        } else {
            for (int i = size; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = item;
            size++;
        }
    }

    /** Removes the element at position index. */
    public Type remove(int index) {
        Type removedElement = list[index];
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size--;
        return removedElement;
    }

    /** Searches the list for the item and returns true if found, false otherwise. */
    public boolean contains(Type item) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                result = true;
                break;
            }
        }
        return result;
    }

    /** Searches the list for the item and returns the index if found, or -1 otherwise. */
    public int indexOf(Type item) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                index = i;
                break;
            }
        }
        return index;
    }

    /** Returns the element stored at index, and returns null if index out of bounds. */
    public Type get(int index) {
        Type item;
        if (index > size || index < 0) {
            item = null;
        } else {
            item = list[index];
        }
        return item;
    }

    /** Updates the element stored at index and does nothing if index out of bounds. */
    public void set(int index, Type item) {
        if (index > size || index < 0) {
//            System.out.println("Do nothing");
        } else {
            list[index] = item;
        }
    }

    /** Returns the size instance field of this Array List. */
    public int size() {
        return size;
    }

    /** Returns true if array list is empty and false otherwise. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Returns string representation of contents of the array list. */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String prefix = "";
        sb.append("[");
        for(int i = 0; i < size; i++) {
            sb.append(prefix + list[i]);
            prefix = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    /** Doubles the capacity of the original array list and copies all from previous list into new one . */
    protected void resize() {
        Type[] newArray = (Type[]) new Object[2 * capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = list[i];
        }
        list = newArray;
    }

}
