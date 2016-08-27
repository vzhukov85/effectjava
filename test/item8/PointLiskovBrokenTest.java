package item8;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PointLiskovBrokenTest {

    private PointLiskovBroken subj;
    private PointLiskovBroken other;
    private CounterPoint counter;

    @Before
    public void setUp() throws Exception {
        subj = new PointLiskovBroken(1, 2);
        other = new PointLiskovBroken(1, 2);
        counter = new CounterPoint(1, 2);
    }

    @Test
    public void testEquals() throws Exception {
        assertThat(subj.equals(other), is(true));
        assertThat(subj.equals(counter), is(false)); // нарушение принципа Лискова
    }
}