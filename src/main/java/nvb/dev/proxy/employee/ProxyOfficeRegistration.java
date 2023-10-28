package nvb.dev.proxy.employee;

public class ProxyOfficeRegistration implements Office {

    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private boolean isEmployed;

    private OfficeRegistration officeRegistration;

    public ProxyOfficeRegistration(String employeeFirstName, String employeeLastName,
                                   int employeeAge, boolean isEmployed) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeAge = employeeAge;
        this.isEmployed = isEmployed;
    }

    @Override
    public void register() {
        if (checkEmployeeIsEmployeeOrNot() && checkEmployeeAge()) {
            officeRegistration = new OfficeRegistration(employeeFirstName, employeeLastName,
                    employeeAge, isEmployed);
            officeRegistration.register();
        } else {
            System.out.println("This employee does not have the required qualification to be hired.");
        }
    }

    private boolean checkEmployeeIsEmployeeOrNot() {
        return isEmployed;
    }

    private boolean checkEmployeeAge() {
        return employeeAge >= 18;
    }
}
