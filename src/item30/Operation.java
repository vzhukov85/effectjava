package item30;

import java.util.HashMap;
import java.util.Map;

public enum Operation {
    PLUS("+") {
        @Override
        double applay(double a, double b) {
            return a + b;
        }
    }, MINUS("-") {
        @Override
        double applay(double a, double b) {
            return a - b;
        }
    }, TIMES("*") {
        @Override
        double applay(double a, double b) {
            return a*b;
        }
    }, DIVIDE("/") {
        @Override
        double applay(double a, double b) {
            return a/b;
        }
    };

    private final String symbol;
    private static final Map<String, Operation> enumMap = new HashMap<>();

    static {
        for(Operation op: Operation.values()) {
            enumMap.put(op.symbol, op);
        }
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static Operation fromString(String symbol) {
        return enumMap.get(symbol);
    }

    Operation(String symbol) {
        this.symbol = symbol;
    }

    abstract double applay(double a, double b);
}
