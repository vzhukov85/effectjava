package item71;


public class SlowCountDown {

    private int count;

    public SlowCountDown(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("count must be >= 0");
        }
        this.count = count;
    }

    public synchronized void countDown() {
        if (count != 0)
            --count;
    }

    public void await() {
        while(true)
            synchronized (this) {
                if (count ==0) return;
            }
    }
}
