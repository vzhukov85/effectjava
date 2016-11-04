package item67;

import item16.ForwardingSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObservableSetCopy<E> extends ForwardingSet<E> implements Observable<E> {

    private List<SetObserver<E>> observerList = new CopyOnWriteArrayList<>();

    public ObservableSetCopy(Set<E> s) {
        super(s);
    }

    @Override
    public void addObserver(SetObserver<E> e) {
        observerList.add(e);
    }

    @Override
    public void removeObserver(SetObserver<E> e) {
        observerList.remove(e);
    }

    private void notifyElementAdded(E e) {
        for(SetObserver<E> o: observerList) {
            o.added(this, e);
        }
    }

    @Override
    public boolean add(E e) {
        notifyElementAdded(e);
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for(E e: c) {
            result |= add(e);
        }
        return result;
    }
}
