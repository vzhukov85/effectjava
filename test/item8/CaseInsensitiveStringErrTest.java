package item8;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CaseInsensitiveStringErrTest {

    private CaseInsensitiveErrString subj;

    @Before
    public void setUp() {
        subj = new CaseInsensitiveErrString("String");
    }

    @Test
    public void testEquals() throws Exception {
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat(subj.equals("String"), is(true));
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat("String".equals(subj), is(false)); // нарушение симметрии

        //noinspection EqualsBetweenInconvertibleTypes
        assertThat(subj.equals("string"), is(true));
        //noinspection EqualsBetweenInconvertibleTypes
        assertThat("string".equals(subj), is(false)); // нарушение симметрии

        CaseInsensitiveErrString upString = new CaseInsensitiveErrString("String");
        CaseInsensitiveErrString lowString = new CaseInsensitiveErrString("string");
        assertThat(subj.equals(upString), is(true));
        assertThat(upString.equals(subj), is(true));


        assertThat(subj.equals(lowString), is(true));
        assertThat(lowString.equals(subj), is(true));
    }
}