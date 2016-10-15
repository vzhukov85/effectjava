package item21;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    public static final StringLengthComparator STRING_LENGTH_COMPARATOR = new StringLengthComparator();

    private StringLengthComparator() {
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
