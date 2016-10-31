package item49;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;


public class SumAllTest {

    @Test
    public void testSlowSum() throws Exception {
        assertThat(SumAll.slowSum(), Matchers.equalTo(((long) Integer.MAX_VALUE)*(Integer.MAX_VALUE-1)/2));
    }

    @Test
    public void testFastSum() throws Exception {
        assertThat(SumAll.fastSum(), Matchers.equalTo(((long) Integer.MAX_VALUE)*(Integer.MAX_VALUE-1)/2));
    }
}