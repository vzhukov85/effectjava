package item77;


public class ElvisStayler {
    static Elvis impersonator;
    private Elvis payload;

    private Object readResolve() {
        impersonator = payload;

        return new String[] {"A Fool such as I"};
    }


}
