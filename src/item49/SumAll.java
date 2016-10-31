package item49;


public class SumAll {

    public static long slowSum() {
        Long sum = 0L;
        for(long i=0; i<Integer.MAX_VALUE; ++i) {
            sum += i;
        }
        return sum;
    }

    public static long fastSum() {
        long sum = 0L;
        for(long i=0; i<Integer.MAX_VALUE; ++i) {
            sum += i;
        }
        return sum;
    }
}
