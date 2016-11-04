package item70;

import java.util.Objects;

public class SimpleInitializer {
    private Object field1 = new Object();
    private Object field2;

    public Object getField1() {
        return field1;
    }

    public synchronized Object getField2() {
        if (field2 == null) {
            field2 = new Object();
        }
        return  field2;
    }
}
