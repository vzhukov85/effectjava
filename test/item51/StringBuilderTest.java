package item51;

import org.junit.Test;

public class StringBuilderTest {

    private final int count = 100000;
    private final String template = "100";

    @Test
    public void testString() {
        String res = "";
        for(int i =0; i< count; ++i) {
            res = res + template;
        }
    }

    @Test
    public void testStringBuilder() {
        StringBuilder res = new StringBuilder();
        for(int i =0; i< count; ++i) {
            res.append(template);
        }
    }

    @Test
    public void testStringBuffer() {
        StringBuffer res = new StringBuffer();
        for(int i =0; i< count; ++i) {
            res.append(template);
        }
    }
}
