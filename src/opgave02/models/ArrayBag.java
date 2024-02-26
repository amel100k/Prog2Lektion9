package opgave02.models;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;
    private E[] items2;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
        this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
        boolean isAdded = false;
        if (size < items.length){
            items[size] = newEntry;
            size++;
            isAdded = true;
        }
        return isAdded;
    }

    @Override
    public E remove() {
        // TODO
        if (size < items.length){
            items[size] = null;
            return items[size];
        }
        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        boolean isRemoved = false;
        for (E item : items) {
            if (item == anEntry) {
                items[size] = null;
                isRemoved = true;
                break;
            }
        }
        return isRemoved;
    }


    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int count = 0;
        for (E item : items) {
            if (item == anEntry){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean contains(E anEntry) {
        boolean doesContain = false;
        for (E item : items) {
            if (item == anEntry) {
                doesContain = true;
                break;
            }
        }
        return doesContain;
    }

    @Override
    public E[] toArray() {
        for (E item : items) {
        if (size < items2.length){
            items2[size] = item;
        }
        }
        return items2;
    }
}