package item28;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class StackTest {
    private Stack<Number> stack;

    @Before
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    public void testPush() throws Exception {
        stack.push(1L);
        assertThat(stack.pop(), Matchers.equalTo(1L));
    }

    @Test
    public void testPushAll() throws Exception {
        stack.pushAll(Arrays.asList(1L, 2L, 3L).iterator());
        assertThat(stack.pop(), Matchers.equalTo(3L));
        assertThat(stack.pop(), Matchers.equalTo(2L));
        assertThat(stack.pop(), Matchers.equalTo(1L));
    }

    @Test
    public void testPopAll() throws Exception {
        stack.pushAll(Arrays.asList(1L, 2L, 3L).iterator());
        List<Object> dst = new ArrayList<>();
        stack.popAll(dst);
        assertThat(stack.isEmpty(), Matchers.is(true));
        assertThat(dst, Matchers.contains(3L, 2L, 1L));
    }
}