package item60;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class SequentialList<E> extends AbstractSequentialList<E> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        Iterator<E> i = listIterator(index);
        try {
            return i.next();
        } catch(NoSuchElementException e) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }
}
