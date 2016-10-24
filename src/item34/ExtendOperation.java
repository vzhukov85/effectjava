package item34;

public enum ExtendOperation implements Operation {

    EXP("^") {
        @Override
        public double applay(double a, double b) {
            return Math.pow(a, b);
        }
    },

    REMAINDER("%") {
        @Override
        public double applay(double a, double b) {
            return a%b;
        }
    };
    private final String symbol;

    @Override
    public String toString() {
        return symbol;
    }

    ExtendOperation(String symbol) {
        this.symbol = symbol;
    }
}
