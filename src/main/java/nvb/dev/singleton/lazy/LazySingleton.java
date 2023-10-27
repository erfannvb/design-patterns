package nvb.dev.singleton.lazy;

import java.io.Serial;
import java.io.Serializable;

public class LazySingleton implements Serializable {

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

    @Serial
    protected Object readResolve() {
        return instance;
    }

}
