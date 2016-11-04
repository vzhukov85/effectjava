package item70;

public class DoubleCheckedLoad {
    private volatile Object obj;

    public Object getObject() {
        Object res  = obj;
        if (res == null) {
            synchronized (this) {
                res = obj;
                if (res == null) {
                    res = obj = new Object();
                }
            }
        }
        return res;
    }
}
