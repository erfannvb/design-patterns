package nvb.dev.singleton.eager;

public class EagerSingleton {

    // Eager Initialization Method

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
