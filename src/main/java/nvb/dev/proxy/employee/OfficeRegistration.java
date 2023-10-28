package nvb.dev.proxy.employee;

import java.util.ArrayList;
import java.util.List;

public class OfficeRegistration implements Office {

    private final Employee employee;
    private final List<Employee> employeeList;

    public OfficeRegistration(Employee employee) {
        this.employee = employee;
        this.employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> addEmployee(Employee newEmployee) {
        newEmployee = new Employee.Builder(employee.getAge(), employee.isEmployed())
                .setFirstName(employee.getFirstName())
                .setLastName(employee.getLastName())
                .setDepartment(employee.getDepartment())
                .setHireDate(employee.getHireDate())
                .setSalary(employee.getSalary()).build();
        employeeList.add(newEmployee);
        return employeeList;
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
        for (Employee emp : employeeList) {
            System.out.println("First Name : " + emp.getFirstName());
            System.out.println("Last Name : " + emp.getLastName());
            System.out.println("Age : " + emp.getAge());
            System.out.println("Is Employed : " + emp.isEmployed());
            System.out.println("Department : " + emp.getDepartment());
            System.out.println("Hire Date : " + emp.getHireDate());
            System.out.println("Salary : " + emp.getSalary());
        }
    }
}
