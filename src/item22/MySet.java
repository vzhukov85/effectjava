package item22;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class MySet<E> extends AbstractSet<E> {
    @Override
    public Iterator<E> iterator() {
        return new MyIterator<E>();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    private class MyIterator<E> implements Iterator<E> {
        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {

        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
