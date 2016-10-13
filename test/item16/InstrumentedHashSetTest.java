package item16;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class InstrumentedHashSetTest {

    private InstrumentedHashSet subj;

    @Before
    public void setUp() {
        subj = new InstrumentedHashSet(new HashSet<String>());
    }


    @Test
    public void testGetCounter() throws Exception {
        subj.addAll(Arrays.asList("one", "two", "three"));
        assertThat(subj.getCounter(), Matchers.equalTo(3));
    }
}