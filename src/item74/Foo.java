package item74;


import java.io.*;

public class Foo extends AbstractFoo implements Serializable {
    public Foo(int x, int y) {
        initialize(x, y);
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int x = s.readInt();
        int y = s.readInt();
        initialize(x, y);
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeInt(getX());
        s.writeInt(getY());
    }


}
