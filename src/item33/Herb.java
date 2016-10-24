package item33;

import java.util.Set;

public class Herb {
    enum Type {ANNUAL, PERENNIAL, BIENNIAL}

    private final String name;
    private final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
