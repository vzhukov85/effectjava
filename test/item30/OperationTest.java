package item30;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {

    @Test
    public void testApplay() throws Exception {
        double a = 2, b = 4;
        for(Operation op: Operation.values()) {
            System.out.printf("%f %s %f = %f%n", a, op, b, op.applay(a, b));
        }
    }

    @Test
    public void testFromString() {
        for(Operation op: Operation.values()) {
            String str = op.toString();
            assertThat(Operation.fromString(str), Matchers.equalTo(op));
        }
    }
}