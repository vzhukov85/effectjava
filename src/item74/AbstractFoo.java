package item74;


import java.util.concurrent.atomic.AtomicReference;

public class AbstractFoo {
    private int x, y;
    private enum State {NEW, INITIALIING, INITIALIZED}
    private final AtomicReference<State> state = new AtomicReference<>(State.NEW);
    public AbstractFoo() {}

    protected void initialize(int x, int y) {
        if (!state.compareAndSet(State.NEW, State.INITIALIING)) {
            throw new IllegalStateException("Already initializing");
        }
        this.x = x;
        this.y = y;
        state.set(State.INITIALIZED);
    }

    private void checkInit() {
        if (state.get() != State.INITIALIZED) {
            throw new IllegalStateException("Uninitialized");
        }
    }

    public int getX() {
        checkInit();
        return x;
    }

    public int getY() {
        checkInit();
        return y;
    }
}
