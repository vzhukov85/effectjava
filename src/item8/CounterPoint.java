package item8;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends PointLiskovBroken {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public int numberCreate() {
        return counter.get();
    }
}
