package item32;

import org.junit.Test;

import static org.junit.Assert.*;


public class TextOldTest {

    @Test
    public void testApplayStyle() throws Exception {
        TextOld text = new TextOld();
        text.applayStyle(TextOld.STYLE_BOLD | TextOld.STYLE_ITALIC);
    }
}