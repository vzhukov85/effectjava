package item26;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackMod1Test {
    private StackMod1<String> stack = new StackMod1<>();

    @Test
    public void testPush() throws Exception {
        stack.push("Hello");
        assertThat(stack.pop(), Matchers.equalTo("Hello"));
    }

}