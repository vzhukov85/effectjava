package item21;

import java.io.Serializable;
import java.util.Comparator;

public class Host {
    private static class StrLngCmp implements Comparator<String>, Serializable {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
    public static final Comparator<String> STR_LNG_CMP = new StrLngCmp();
}
