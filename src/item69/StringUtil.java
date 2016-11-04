package item69;


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class StringUtil {
    private ConcurrentMap<String, String> map = new ConcurrentHashMap<>();

    public String internSlow(String s) {
        String result = map.putIfAbsent(s, s);
        if (result == null) {
            return s;
        }
        return result;
    }

    public String internFast(String s) {
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null)
                return s;
        }
        return result;
    }
}
