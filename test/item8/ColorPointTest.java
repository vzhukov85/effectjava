package item8;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ColorPointTest {

    private ColorPoint subj;
    private ColorPoint same;
    private ColorPoint other;
    private Point p;

    @Before
    public void setUp() {
        subj  = new ColorPoint(1, 2, Color.RED);
        same  = new ColorPoint(1, 2, Color.RED);
        other = new ColorPoint(1, 2, Color.BLACK);
        p     = new Point(1, 2);
    }

    @Test
    public void testEquals() throws Exception {
        assertThat(subj.equals(same), is(true));
        assertThat(subj.equals(other), is(false));
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat(subj.equals(p), is(false));
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat(p.equals(subj), is(false));
        //noinspection EqualsBetweenInconvertibleTypes,ObjectEqualsNull
        assertThat(p.equals(null), is(false));

    }
}