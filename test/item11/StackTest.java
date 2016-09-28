package item11;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class StackTest {

    private Stack subj;

    @Before
    public void setUp() {
        subj = new Stack();
    }

    @Test
    public void testPushPop() throws Exception {
        Object o = new Object();
        subj.push(o);
        assertThat(subj.pop(), equalTo(o));
    }

    @Test
    public void testClone() {
        Object o = new Object();
        subj.push(o);
        Stack stack = subj.clone();

        stack.pop();
        assertThat(subj.pop(), equalTo(o));
    }

    @Test(expected = EmptyStackException.class)
    public void testPush_empty() throws Exception {
        subj.pop();
    }

}