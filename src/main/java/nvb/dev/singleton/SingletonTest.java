package nvb.dev.singleton;

import nvb.dev.singleton.doubleLock.DoubleLockSingleton;

public class SingletonTest {
    public static void main(String[] args) {

        DoubleLockSingleton lazySingleton1 = DoubleLockSingleton.getInstance();
        DoubleLockSingleton lazySingleton2 = DoubleLockSingleton.getInstance();

        System.out.println("Object 1 : " + lazySingleton1.hashCode());
        System.out.println("Object 2 : " + lazySingleton2.hashCode());

    }
}
