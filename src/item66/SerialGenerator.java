package item66;

import java.util.concurrent.atomic.AtomicLong;

public class SerialGenerator {

    private static volatile int serialNumberVolatile = 0;
    private static long serialNumberrSync = 0;
    private static AtomicLong serialNumberAtomic = new AtomicLong(0);

    public static int getNextSerialNumberVolatile() {
        return serialNumberVolatile++;
    }

    public static synchronized long getNextSerialNumberSync() {
        return serialNumberrSync++;
    }

    public static long getNextSerialNumberAtomic() {
        return serialNumberAtomic.getAndIncrement();
    }
}
