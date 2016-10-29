package item41;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {
    public static String classify(Collection<?> collection) {
        if (collection instanceof Set<?>) {
            return "set";
        } else if (collection instanceof List<?>) {
            return "list";
        } else {
            return "unknown";
        }
    }
}
