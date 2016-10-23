package item32;

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.*;

public class TextTest {

    @Test
    public void testApplayStyle() throws Exception {
        Text text = new Text();
        text.applayStyle(EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC));
    }
}