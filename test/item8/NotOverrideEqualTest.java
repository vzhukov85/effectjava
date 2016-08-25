package item8;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class NotOverrideEqualTest {
    private NotOverrideEqual subj = new NotOverrideEqual();

    @Test(expected = AssertionError.class)
    public void testEquals() throws Exception {
        assertNotEquals(subj, new NotOverrideEqual());
    }
}