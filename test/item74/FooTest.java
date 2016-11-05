package item74;


import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class FooTest {

    private Foo subj;

    @Before
    public void setUp() {
        subj = new Foo(1,2);
    }

    @Test
    public void testReadWriteObject() throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(new File("foo.blob"), true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(subj);

        FileInputStream fin = new FileInputStream(new File("foo.blob"));
        ObjectInputStream ois = new ObjectInputStream(fin);

        Foo res = (Foo) ois.readObject();

        assertThat(res.getX(), Matchers.equalTo(1));
        assertThat(res.getY(), Matchers.equalTo(2));
    }

}