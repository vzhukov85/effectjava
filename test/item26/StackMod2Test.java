package item26;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackMod2Test {

    private StackMod2<String> subj = new StackMod2<>();

    @Test
    public void testPush() throws Exception {
        subj.push("Hello");
        assertThat(subj.pop(), Matchers.equalTo("Hello"));
    }
}