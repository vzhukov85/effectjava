package item67;

public interface Observable<E> {
    void addObserver(SetObserver<E> e);
    void removeObserver(SetObserver<E> e);
}
