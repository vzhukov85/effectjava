package item27;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


public class GenericMethodUtilsTest {

    @Test
    public void testUnion() throws Exception {
        Set<String> s1 = new HashSet<>(Arrays.asList("Tom", "Dic", "Harry"));
        Set<String> s2 = new HashSet<>(Arrays.asList("Larry", "Moe", "Dic"));
        Set<String> res =  GenericMethodUtils.union(s1, s2);
        assertThat(res, Matchers.containsInAnyOrder("Tom", "Dic", "Harry", "Larry", "Moe"));
    }

    @Test
    public void testNewHashMap() {
        Map<String, String> map = GenericMethodUtils.newHashMap();
        map.put("key", "value");
        assertThat(map, Matchers.hasKey("key"));
    }

    @Test
    public void testGetIdentityFunction() {
        UnaryFunction<Long> unaryLong = GenericMethodUtils.getIdentityFunction();
        Long res = 0L;
        for(Long l: Arrays.asList(1L, 2L)) {
            res += unaryLong.applay(l);
        }
        assertThat(res, Matchers.equalTo(3L));

        UnaryFunction<String> unaryString = GenericMethodUtils.getIdentityFunction();
        String resStr = "";
        for(String s: Arrays.asList("1", "2")) {
            resStr += unaryString.applay(s);
        }
        assertThat(resStr, Matchers.equalTo("12"));
    }

    @Test
    public void testMax() {
        List<Long> list = new ArrayList<>(Arrays.asList(10L, 2L, 5L));
        assertThat(GenericMethodUtils.max(list), Matchers.equalTo(10L));
    }
}