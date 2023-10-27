package nvb.dev.singleton;

import nvb.dev.singleton.lazy.LazySingletonCloning;

public class CloningSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {

        LazySingletonCloning obj1 = LazySingletonCloning.getInstance();
        LazySingletonCloning obj2 = (LazySingletonCloning) obj1.clone();

        System.out.println("Object 1 : " + obj1.hashCode());
        System.out.println("Object 2 : " + obj2.hashCode());

    }
}
