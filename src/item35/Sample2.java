package item35;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {
    @Test
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i/i;
    }

    @Test
    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] i = new int[0];
        int b = i[1];
    }

    @Test
    @ExceptionTest(ArithmeticException.class)
    public static void m3() {

    }

    @Test
    @ExceptionTest({NullPointerException.class, IndexOutOfBoundsException.class})
    public static void m4() {
        List<Integer> list = new ArrayList<>();

        list.addAll(5, null);
    }
}
