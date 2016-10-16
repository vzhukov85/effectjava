package item25;

import java.util.ArrayList;
import java.util.List;

public class Reducer<E> {
    public E reduce(List<E> list, Function<E> function, E initValue) {
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
}
