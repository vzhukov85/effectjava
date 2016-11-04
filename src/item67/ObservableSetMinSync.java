package item67;

import item16.ForwardingSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ObservableSetMinSync<E> extends ForwardingSet<E> implements Observable<E> {

    private List<SetObserver<E>> observerList = new ArrayList<>();

    public ObservableSetMinSync(Set<E> s) {
        super(s);
    }

    @Override
    public void addObserver(SetObserver<E> e) {
        synchronized (observerList) {
            observerList.add(e);
        }
    }

    @Override
    public void removeObserver(SetObserver<E> e) {
        synchronized (observerList) {
            observerList.remove(e);
        }
    }

    private void notifyElementAdded(E e) {
        List<SetObserver<E>> copyObserver = null;
        synchronized (observerList) {
            copyObserver = new ArrayList<>(observerList);
        }
        for(SetObserver<E> o: copyObserver) {
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
