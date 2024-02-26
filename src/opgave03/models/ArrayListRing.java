package opgave03.models;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListRing<T> implements Ring<T>{
    private final ArrayList<T> items = new ArrayList<>();
    private int size;

    public ArrayListRing(){
        size = 0;
    }
    @Override
    public void advance() {

    }

    @Override
    public T getCurrentItem() {
        return items.get(0);
    }

    @Override
    public void add(T item) {
        if (!items.contains(item)){
            items.add(item);
        }
    }

    @Override
    public boolean removeItem(T item) {
        boolean isRemoved = false;
        for (T t : items) {
            if (t == item){
                t = null;
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    @Override
    public T removeCurrentItem() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
