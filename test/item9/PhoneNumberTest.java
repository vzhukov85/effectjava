package item9;

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
}