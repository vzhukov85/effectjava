package item42;

import item35.ExceptionTest;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class VarargsUtilTest {

    @Test
    public void testSum() throws Exception {
        assertThat(VarargsUtil.sum(1, 0, 2), Matchers.equalTo(3));
        assertThat(VarargsUtil.sum(), Matchers.equalTo(0));
    }

    @Test
     public void testMinBad() throws Exception {
        assertThat(VarargsUtil.minBad(1, 0, 2), Matchers.equalTo(0));
        assertThat(VarargsUtil.minBad(1), Matchers.equalTo(1));
    }

    @Test(expected =  IllegalArgumentException.class)
    public void testMinBad_exception() throws Exception {
        VarargsUtil.minBad();
    }

    @Test
    public void testMin() throws Exception {
        assertThat(VarargsUtil.min(1, 0, 2), Matchers.equalTo(0));
    }
}