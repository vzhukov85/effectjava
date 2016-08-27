package item8;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class ColorPointBrokenSymmetryTest {

    private ColorPointBrokenSymmetry subj;
    private Point p;

    @Before
    public void setUp() throws Exception {
        subj = new ColorPointBrokenSymmetry(1, 2, Color.RED);
        p = new Point(1, 2);
    }

    @Test
    public void testEquals() throws Exception {
        assertThat(p.equals(subj), is(true));
        assertThat(subj.equals(p), is(false)); //нарушение симметрии
    }
}