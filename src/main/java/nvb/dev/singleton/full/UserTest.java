package nvb.dev.singleton.full;

public class UserTest {
    public static void main(String[] args) {

        User user = User.getInstance();
        user.setName("John");
        user.setUsername("john.doe");
        user.setEmail("john.doe@gmail.com");
        user.setAge(28);

        System.out.println(user.getName());
        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
        System.out.println(user.getAge());

    }
}
