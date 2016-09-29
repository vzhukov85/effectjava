package item9;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class PhoneNumberTest {

    private PhoneNumber subj;
    private Map<PhoneNumber, String> dictionary;

    @Before
    public void setUp() throws Exception {
        subj = new PhoneNumber(9, 10, 30);
        dictionary = new HashMap<>();
        dictionary.put(subj, "Susan");
    }

    @Test
    public void incorrectHashCode() {
        assertThat(dictionary.get(new PhoneNumber(9, 10, 30)), equalTo("Susan"));
    }

    @Test
    public void testCompareTo() {
        PhoneNumber other = new PhoneNumber(9, 10, 30);
        assertThat(subj.compareTo(other), equalTo(0));

        other = new PhoneNumber(8, 10, 30);
        assertThat(subj.compareTo(other), Matchers.greaterThan(0));
        other = new PhoneNumber(9, 9, 30);
        assertThat(subj.compareTo(other), Matchers.greaterThan(0));
        other = new PhoneNumber(9, 10, 29);
        assertThat(subj.compareTo(other), Matchers.greaterThan(0));

        other = new PhoneNumber(10, 10, 30);
        assertThat(subj.compareTo(other), Matchers.lessThan(0));
        other = new PhoneNumber(9, 11, 30);
        assertThat(subj.compareTo(other), Matchers.lessThan(0));
        other = new PhoneNumber(9, 10, 31);
        assertThat(subj.compareTo(other), Matchers.lessThan(0));
    }
}