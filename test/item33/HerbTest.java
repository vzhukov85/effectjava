package item33;

import org.junit.Before;
import org.junit.Test;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class HerbTest {

    private Herb[] herbs;

    @Before
    public void setUp() {
        herbs = new Herb[] {new Herb("one", Herb.Type.ANNUAL), //
                new Herb("two", Herb.Type.PERENNIAL), //
                new Herb("three", Herb.Type.BIENNIAL), //
                new Herb("four", Herb.Type.BIENNIAL)};
    }

    @Test
    public void testHerbsByTypeArray() {
        Set<Herb>[] herbsByType = new Set[Herb.Type.values().length];
        for(int i = 0; i < herbsByType.length; ++i) {
            herbsByType[i] = new HashSet<>();
        }
        for(Herb herb: herbs) {
            herbsByType[herb.getType().ordinal()].add(herb);
        }

        for(int i = 0; i< herbsByType.length; ++i) {
            System.out.printf("%s: %s%n", Herb.Type.values()[i], herbsByType[i]);
        }
    }

    @Test
    public void testHerbsByTypeEnumMap() {
        Map<Herb.Type, Set<Herb>> herbsByType = new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);
        for(Herb.Type type: Herb.Type.values()) {
            herbsByType.put(type, new HashSet<>());
        }
        for(Herb herb: herbs) {
            herbsByType.get(herb.getType()).add(herb);
        }

        System.out.println(herbsByType);
    }
}