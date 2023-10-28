package nvb.dev.proxy.employee;

public class ProxyOfficeRegistration implements Office {

    private final Employee employee;

    private OfficeRegistration officeRegistration;

    public ProxyOfficeRegistration(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void register() {
        if (validate()) {
            officeRegistration = new OfficeRegistration(employee);
            officeRegistration.register();
        } else {
            System.out.println("This employee does not have the required qualifications to get hired.");
        }
    }

    @Override
    public String getFirstName() {
        if (validate() && officeRegistration.getFirstName() != null) return employee.getFirstName();
        return "First Name Not Found!";
    }

    @Override
    public String getDepartment() {
        if (validate() && officeRegistration.getDepartment() != null) return employee.getDepartment();
        return "Department Not Found";
    }

    @Override
    public void showInfo() {
        if (validate()) {
            officeRegistration.showInfo();
        } else {
            System.out.println("No Employees Found!");
        }
    }

    private boolean validate() {
        return checkEmployeeIsEmployeeOrNot() && checkEmployeeAge();
    }

    private boolean checkEmployeeIsEmployeeOrNot() {
        return !employee.isEmployed();
    }

    private boolean checkEmployeeAge() {
        return employee.getAge() >= 18;
    }
}
