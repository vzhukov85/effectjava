package item42;

public class VarargsUtil {

    public static int sum(int ... args) {
        int sum=0;
        for(int val: args) {
            sum+= val;
        }
        return sum;
    }

    public static int minBad(int ... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException();
        }
        int min = args[0];
        for(int i=1; i<args.length; ++i) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }

    public static int min(int first, int ... args) {
        int min = first;
        for(int val: args) {
            if (min > val) {
                min = val;
            }
        }
        return min;
    }

}
