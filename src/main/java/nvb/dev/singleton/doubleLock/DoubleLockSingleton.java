package nvb.dev.singleton.doubleLock;

public class DoubleLockSingleton {

    // Lazy Initialization with Double Lock Method

    private static DoubleLockSingleton instance = null;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (instance == null) instance = new DoubleLockSingleton();
            }
        }
        return instance;
    }

}
