package nvb.dev.singleton.lazy;

public class LazySingletonCloning implements Cloneable {

    private static LazySingletonCloning instance = null;

    private LazySingletonCloning() {
    }

    public static LazySingletonCloning getInstance() {
        if (instance == null) {
            synchronized (LazySingletonCloning.class) {
                instance = new LazySingletonCloning();
            }
        }
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
