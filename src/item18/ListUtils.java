package item18;


import java.util.AbstractList;
import java.util.List;

public class ListUtils {

    public static List<Integer> intArrayAsLit(int[] array) {
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return array[index];
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldValue = array[index];
                array[index] = element;
                return oldValue;
            }

            @Override
            public int size() {
                return array.length;
            }
        };
    }
}
