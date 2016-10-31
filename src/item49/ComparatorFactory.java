package item49;

import java.util.Comparator;

public class ComparatorFactory {
    public static Comparator<Integer> getBadInstance() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 > o2) ? 1 : (o1 == o2 ? 0 : -1);
            }
        };
    }

    public static Comparator<Integer> getInstance() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int first = o1;
                int second = o2;
                return (first > second) ? 1 : (first == second ? 0 : -1);
            }
        };
    }
}
