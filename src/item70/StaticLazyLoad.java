package item70;

public class StaticLazyLoad {
    private static class Initializer {
        private static Object obj = new Object();
    }
    public static Object getObject() {
        return Initializer.obj;
    }
}
