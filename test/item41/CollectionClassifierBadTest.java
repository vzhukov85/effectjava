package item41;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;


public class CollectionClassifierBadTest {

    private  Collection<?>[] cols;

    @Before
    public void setUp() {
        cols = new Collection[] {
                new TreeSet<>(),
                new ArrayList<>(),
                new HashMap<>().values()
        };
    }


    @Test
    public void testBad() {
        for(Collection c: cols) {
            System.out.println(CollectionClassifierBad.classify(c));
        }
    }

    @Test
    public void testGood() {
        for(Collection c: cols) {
            System.out.println(CollectionClassifier.classify(c));
        }
    }

}