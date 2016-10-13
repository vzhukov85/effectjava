package item16;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    private int counter = 0;

    public InstrumentedHashSet(Set<E> e) {
        super(e);
    }

    @Override
    public boolean add(E e) {
        ++counter;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        counter += c.size();
        return super.addAll(c);
    }

    public int getCounter() {
        return counter;
    }
}
