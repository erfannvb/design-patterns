package nvb.dev.singleton;

import nvb.dev.singleton.lazy.LazySingleton;

import java.lang.reflect.Constructor;

public class ReflectionTest {
    public static void main(String[] args) {

        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = null;

        try {

            Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            obj2 = constructor.newInstance();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Object 1 : " + obj1.hashCode());
        System.out.println("Object 2 : " + obj2.hashCode());

    }
}
