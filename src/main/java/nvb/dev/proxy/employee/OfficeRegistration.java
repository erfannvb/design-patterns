package nvb.dev.proxy.employee;

public class OfficeRegistration implements Office {

    private final Employee employee;

    public OfficeRegistration(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void register() {
        System.out.println("New Employee Registered : " + employee.getFirstName() +
                " " + employee.getLastName());
    }

    @Override
    public String getFirstName() {
        return employee.getFirstName();
    }

    @Override
    public String getDepartment() {
        return employee.getDepartment();
    }

    @Override
    public void showInfo() {
        System.out.println("First Name : " + employee.getFirstName());
        System.out.println("Last Name : " + employee.getLastName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Is Employed : " + employee.isEmployed());
        System.out.println("Department : " + employee.getDepartment());
        System.out.println("Hire Date : " + employee.getHireDate());
        System.out.println("Salary : " + employee.getSalary());
    }
}
