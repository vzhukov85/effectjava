import java.io.Serializable;

public class ElvisSerialize implements Serializable {

    public static final ElvisSerialize INSTANCE = new ElvisSerialize();

    private ElvisSerialize() {}

    public void leaveTheBuilding() {

    }

    public Object readResolve() {
        return INSTANCE;
    }
}
