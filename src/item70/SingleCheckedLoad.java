package item70;


public class SingleCheckedLoad {
    private volatile Object obj;

    public Object getObj() {
        if (obj == null) {
            obj = new Object();
        }
        return obj;
    }
}
