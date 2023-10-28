package nvb.dev.proxy.employee;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final boolean isEmployed;

    private Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.isEmployed = builder.isEmployed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private final int age;
        private final boolean isEmployed;

        public Builder(int age, boolean isEmployed) {
            this.age = age;
            this.isEmployed = isEmployed;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
