package item18;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListUtilsTest {

    @Test
    public void testIntArrayAsLit() throws Exception {
        int[] subj = new int[]{1,2,3};
        List<Integer> res=ListUtils.intArrayAsLit(subj);
        assertThat(res.get(1), Matchers.equalTo(2));
        assertThat(res.set(1, 5), Matchers.equalTo(2));
        assertThat(res.get(1), Matchers.equalTo(5));
    }
}