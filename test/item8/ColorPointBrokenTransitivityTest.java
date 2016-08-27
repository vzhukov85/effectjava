package item8;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ColorPointBrokenTransitivityTest {
    private ColorPointBrokenTransitivity subj;
    private ColorPointBrokenTransitivity other;
    private Point p;

    @Before
    public void setUp() throws Exception {
        subj = new ColorPointBrokenTransitivity(1, 2, Color.RED);
        other = new ColorPointBrokenTransitivity(1, 2, Color.BLUE);
        p = new Point(1, 2);
    }

    @Test
    public void testEquals() throws Exception {
        assertThat(subj.equals(p), is(true));
        assertThat(p.equals(other), is(true));
        assertThat(subj.equals(other), is(false)); // нарушение транзитивности
    }
}