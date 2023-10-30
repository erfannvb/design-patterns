package nvb.dev.singleton.full;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable, Cloneable {

    private static User instance = null;

    private String name;
    private String username;
    private String email;
    private int age;

    private User() {
        if (instance != null) throw new IllegalStateException();
    }

    public static User getInstance() {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) instance = new User();
            }
        }
        return instance;
    }

    public static void setInstance(User instance) {
        User.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return instance;
    }

    @Serial
    public Object readResolve() {
        return instance;
    }
}
