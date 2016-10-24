package item33;

public enum PhaseBad {
    SOLID, LIQUID, GAS;
    public enum Transition {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT
    }

    private static final Transition[][] TRANSITIONS = {
            {null, Transition.MELT, Transition.SUBLIME},
            {Transition.FREEZE, null, Transition.BOIL},
            {Transition.DEPOSIT, Transition.CONDENSE, null}
    };

    public static Transition from(PhaseBad src, PhaseBad dst) {
        return TRANSITIONS[src.ordinal()][dst.ordinal()];
    }
}
