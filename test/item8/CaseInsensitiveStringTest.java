package item8;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CaseInsensitiveStringTest {

    private CaseInsensitiveString subj;

    @Before
    public void setUp() {
        subj = new CaseInsensitiveString("String");
    }

    @Test
    public void testEquals() throws Exception {
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat(subj.equals("String"), is(false));
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat("String".equals(subj), is(false));

        //noinspection EqualsBetweenInconvertibleTypes
        assertThat(subj.equals("string"), is(false));
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat("string".equals(subj), is(false));

        CaseInsensitiveString upString = new CaseInsensitiveString("String");
        CaseInsensitiveString lowString = new CaseInsensitiveString("string");

        assertThat(subj.equals(upString), is(true));
        assertThat(upString.equals(subj), is(true));

        assertThat(subj.equals(lowString), is(true));
        assertThat(lowString.equals(subj), is(true));
    }
}