package nvb.dev.proxy.employee;

public class OfficeRegistration implements Office {

    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private boolean isEmployed;


    @Override
    public void register() {
        System.out.println("New Employee Registered : " + employeeFirstName + " " + employeeLastName);
    }

    public OfficeRegistration(String employeeFirstName, String employeeLastName,
                              int employeeAge, boolean isEmployed) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeAge = employeeAge;
        this.isEmployed = isEmployed;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}
