package nvb.dev.singleton.lazy;

public class LazySingleton {

    // Lazy Initialization Method

    private static LazySingleton instance = null;

    private LazySingleton() {
        if (instance != null) throw new IllegalStateException();
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }

}
