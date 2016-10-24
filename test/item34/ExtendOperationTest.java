package item34;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class ExtendOperationTest {
    @Test
    public void test() {
        Helper.iterateOperation(ExtendOperation.class, 2, 4);

        Helper.iterateOperation(Arrays.asList(ExtendOperation.values()), 2, 4);
    }
}