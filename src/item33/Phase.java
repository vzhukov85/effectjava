package item33;

import java.util.EnumMap;
import java.util.Map;

public enum Phase {
    SOLID, LIQUID, GAS;
    public enum Transition {
        MELT(SOLID, LIQUID), //
        FREEZE(LIQUID, SOLID), //
        BOIL(LIQUID, GAS), //
        CONDENSE(GAS, LIQUID), //
        SUBLIME(SOLID, GAS), //
        DEPOSIT(GAS, SOLID);

        private Phase src;
        private Phase dst;

        Transition(Phase src, Phase dst) {
            this.src = src;
            this.dst = dst;
        }

    }

    private static final Map<Phase, Map<Phase, Phase.Transition>> m = new EnumMap<>(Phase.class);

    static {
        for(Phase p: Phase.values()) {
            m.put(p, new EnumMap<>(Phase.class));
        }
        for(Phase.Transition t: Phase.Transition.values()) {
            m.get(t.src).put(t.dst, t);
        }
    }

    public static Phase.Transition from(Phase src, Phase dst) {
        return m.get(src).get(dst);
    }
}
