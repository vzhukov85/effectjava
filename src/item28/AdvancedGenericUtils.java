package item28;

import item25.Function;

import java.util.*;

public class AdvancedGenericUtils {

    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> res = new HashSet<>(s1);
        res.addAll(s2);
        return res;
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> collection) {
        Iterator<? extends T> iterator = collection.listIterator();
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

    public static <E> E reduce(List<? extends E> list, Function<E> function, E initValue) {
        List<E> snapshot;
        synchronized (list) {
            snapshot = new ArrayList<>(list);
        }
        E result = initValue;
        for(E value: snapshot) {
            result = function.applay(result, value);
        }
        return result;
    }

    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }


}
