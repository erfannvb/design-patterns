package nvb.dev.proxy.employee;

public class ProxyOfficeRegistration implements Office {

    private final Employee employee;

    private OfficeRegistration officeRegistration;

    public ProxyOfficeRegistration(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void register() {
        if (checkEmployeeIsEmployeeOrNot() && checkEmployeeAge()) {
            officeRegistration = new OfficeRegistration(employee);
            officeRegistration.register();
        } else {
            System.out.println("This employee does not have the required qualifications to get hired.");
        }
    }

    private boolean checkEmployeeIsEmployeeOrNot() {
        return employee.isEmployed();
    }

    private boolean checkEmployeeAge() {
        return employee.getAge() >= 18;
    }
}
