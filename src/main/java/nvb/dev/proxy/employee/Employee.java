package nvb.dev.proxy.employee;

import java.time.LocalDate;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final boolean isEmployed;
    private final String department;
    private final LocalDate hireDate;
    private final int salary;

    private Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.isEmployed = builder.isEmployed;
        this.department = builder.department;
        this.hireDate = builder.hireDate;
        this.salary = builder.salary;
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

    public String getDepartment() {
        return department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isEmployed=" + isEmployed +
                ", department='" + department + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private final int age;
        private final boolean isEmployed;
        private String department;
        private LocalDate hireDate;
        private int salary;


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

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setHireDate(LocalDate hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
