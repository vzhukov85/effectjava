package item28;

import item25.Function;
import item27.GenericMethodUtils;
import item27.UnaryFunction;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class AdvancedGenericUtilsTest {

    @Test
    public void testUnion() throws Exception {
        Set<String> s1 = new HashSet<>(Arrays.asList("Tom", "Dic", "Harry"));
        Set<String> s2 = new HashSet<>(Arrays.asList("Larry", "Moe", "Dic"));
        Set<String> res =  AdvancedGenericUtils.union(s1, s2);
        assertThat(res, Matchers.containsInAnyOrder("Tom", "Dic", "Harry", "Larry", "Moe"));
    }

    @Test
    public void testUnionNumber() throws Exception {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Double> s2 = new HashSet<>(Arrays.asList(2., 3., 4.));
        Set<Number> res =  AdvancedGenericUtils.union(s1, s2);
        assertThat(res, Matchers.hasSize(6));
    }

    @Test
    public void testMax() {
        List<Long> list = new ArrayList<>(Arrays.asList(10L, 2L, 5L));
        assertThat(AdvancedGenericUtils.max(list), Matchers.equalTo(10L));
    }

    @Test
    public void testReduce() {
        Function<Number> f = new Function<Number>() {
            @Override
            public Number applay(Number result, Number value) {
                return result.longValue() + value.longValue();
            }
        };

        List<Long> input = new ArrayList<>(Arrays.asList(1L, 2L));

        assertThat(AdvancedGenericUtils.reduce(input, f, 0L), Matchers.equalTo(3L));
    }

    @Test
    public void testSwap() {
        List<Long> list = Arrays.asList(1L, 2L);
        assertThat(list, Matchers.contains(1L, 2L));
        AdvancedGenericUtils.swap(list, 0, 1);
        assertThat(list, Matchers.contains(2L, 1L));
    }


}