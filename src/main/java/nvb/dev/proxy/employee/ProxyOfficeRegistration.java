package nvb.dev.proxy.employee;

import java.util.ArrayList;
import java.util.List;

public class ProxyOfficeRegistration implements Office {

    private final Employee employee;
    List<Employee> employeeList = new ArrayList<>();

    private OfficeRegistration officeRegistration;

    public ProxyOfficeRegistration(Employee employee) {
        this.employee = employee;
    }

    @Override
    public List<Employee> addEmployee(Employee newEmployee) {
        if (validate()) {
            officeRegistration = new OfficeRegistration(employee);
            employeeList = officeRegistration.addEmployee(employee);
        } else {
            System.out.println("This employee does not have the required qualifications to get hired.");
        }
        return employeeList;
    }

    @Override
    public String getFirstName() {
        if (validate() && officeRegistration.getFirstName() != null) return officeRegistration.getFirstName();
        return "First Name Not Found!";
    }

    @Override
    public String getDepartment() {
        if (validate() && officeRegistration.getDepartment() != null) return officeRegistration.getDepartment();
        return "Department Not Found";
    }

    @Override
    public void showInfo() {
        if (validate() && !employeeList.isEmpty()) {
            officeRegistration.showInfo();
        } else {
            System.out.println("No Employees Found!");
        }
    }

    private boolean validate() {
        return checkEmployeeIsEmployedOrNot() && checkEmployeeAge();
    }

    private boolean checkEmployeeIsEmployedOrNot() {
        return !employee.isEmployed();
    }

    private boolean checkEmployeeAge() {
        return employee.getAge() >= 18;
    }
}
