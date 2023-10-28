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
}
