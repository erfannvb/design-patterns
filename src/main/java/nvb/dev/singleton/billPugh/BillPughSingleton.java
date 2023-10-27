package nvb.dev.singleton.billPugh;

public class BillPughSingleton {

    // Initialization on-demand holder idiom

    private BillPughSingleton() {
    }

    public static class SingletonClassHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonClassHolder.INSTANCE;
    }

}
