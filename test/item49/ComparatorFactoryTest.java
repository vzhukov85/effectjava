package item49;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class ComparatorFactoryTest {

    @Test
    public void testGetBadInstance() throws Exception {
        Comparator<Integer> bad = ComparatorFactory.getBadInstance();
        assertThat(bad.compare(new Integer(42), new Integer(42)), Matchers.equalTo(-1));
        assertThat(bad.compare(new Integer(43), new Integer(42)), Matchers.equalTo(1));
        assertThat(bad.compare(new Integer(41), new Integer(42)), Matchers.equalTo(-1));
    }

    @Test
    public void testGetInstance() throws Exception {
        Comparator<Integer> good = ComparatorFactory.getInstance();
        assertThat(good.compare(new Integer(42), new Integer(42)), Matchers.equalTo(0));
        assertThat(good.compare(new Integer(43), new Integer(42)), Matchers.equalTo(1));
        assertThat(good.compare(new Integer(41), new Integer(42)), Matchers.equalTo(-1));
    }
}