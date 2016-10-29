package item41;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionClassifierBad {
    public static String classify(Set<?> set) {
        return "set";
    }

    public static String classify(List<?> list) {
        return "list";
    }

    public static String classify(Collection<?> collection) {
        return "unknown";
    }
}
