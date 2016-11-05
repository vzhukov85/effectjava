package item75;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StringList implements Serializable {
    private transient int size = 0;
    private transient Entry head = null;

    private static class Entry {
        private Entry next;
        private Entry prev;
        private String value;
    }

    public void add(String value) {

    }

    /**
     * @serialData
     * @param s
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeInt(size);

        for(Entry curr = head; curr != null; curr = curr.next) {
            s.writeObject(curr.value);
        }
    }

    /**
     * @serialData
     * @param s
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int size = s.readInt();
        for(int i=0; i<size; ++i) {
            add((String) s.readObject());
        }
    }
}
