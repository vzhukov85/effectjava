package item34;

public enum BasicOperation implements Operation {
    PLUS("+") {
       @Override
        public double applay(double a, double b) {
            return a + b;
        }
    }, MINUS("-") {
       @Override
        public  double applay(double a, double b) {
            return a - b;
        }
    }, TIMES("*") {
       @Override
        public double applay(double a, double b) {
            return a*b;
        }
    }, DIVIDE("/") {
        @Override
        public double applay(double a, double b) {
            return a/b;
        }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

}


