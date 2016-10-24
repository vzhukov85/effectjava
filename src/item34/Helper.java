package item34;


import java.util.Collection;

public class Helper {
    public static <T extends Enum<T> & Operation> void iterateOperation(Class<T> enumOper, double a, double b) {

        for(Operation o: enumOper.getEnumConstants()) {
            System.out.printf("%f %s %f = %f %n", a, o.toString(), b, o.applay(a, b));
        }

    }

    public static <T extends Operation> void iterateOperation(Collection<T> operation, double a, double b) {

        for(Operation o: operation) {
            System.out.printf("%f %s %f = %f %n", a, o.toString(), b, o.applay(a, b));
        }

    }
}
