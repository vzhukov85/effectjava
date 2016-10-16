package item27;

import java.util.*;

public class GenericMethodUtils {
    private static final UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {
        @Override
        public Object applay(Object arg) {
            return arg;
        }
    };

    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> getIdentityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> res = new HashSet<>(s1);
        res.addAll(s2);
        return res;
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <T extends Comparable<T>> T max(List<T> collection) {
        Iterator<T> iterator = collection.listIterator();
        if (!iterator.hasNext()) {
            return null;
        }
        T res = iterator.next();
        while (iterator.hasNext()) {
            T curr = iterator.next();
            if (res.compareTo(curr) < 0) {
                res = curr;
            }
        }
        return res;
    }
}
