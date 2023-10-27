package nvb.dev.singleton;

import nvb.dev.singleton.lazy.LazySingleton;

import java.io.*;

public class DeserializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LazySingleton lazySingleton = LazySingleton.getInstance();

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
        outputStream.writeObject(lazySingleton);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file.txt"));
        LazySingleton deserialized = (LazySingleton) inputStream.readObject();
        inputStream.close();

        System.out.println("Object 1 : " + lazySingleton.hashCode());
        System.out.println("Object 2 : " + deserialized.hashCode());

    }
}
