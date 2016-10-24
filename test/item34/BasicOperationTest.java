package item34;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BasicOperationTest {
    @Test
    public void test() {
        Helper.iterateOperation(BasicOperation.class, 2, 4);

        Helper.iterateOperation(Arrays.asList(BasicOperation.values()), 2, 4);
    }
}