package item21;

import java.util.Arrays;
import java.util.Comparator;

public class AnonExample {
    public static void main(String[] args) {
        Arrays.sort(new String[]{"22", "1", "333"}, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
    }
}
