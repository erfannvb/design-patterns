package nvb.dev.proxy.employee;

import java.time.LocalDate;
import java.util.List;

public class EmployeeTest {

    private static final String FIRST_NAME = "Erfan";
    private static final String LAST_NAME = "Navab";
    private static final int AGE = 25;
    private static final boolean IS_EMPLOYED = false;

    public static void main(String[] args) {

        Employee employee = new Employee.Builder(AGE, IS_EMPLOYED)
                .setFirstName(FIRST_NAME)
                .setLastName(LAST_NAME)
                .setDepartment("IT")
                .setHireDate(LocalDate.of(2021, 4, 15))
                .setSalary(1500)
                .build();

        Office office = new ProxyOfficeRegistration(employee);
        List<Employee> employeeList = office.addEmployee(employee);

        System.out.println(employeeList);

        System.out.println("--------------");
        try {
            System.out.println("Name : " + employeeList.get(0).getFirstName());
            System.out.println("Department : " + employeeList.get(0).getDepartment());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Employee list is empty.");
        }

        System.out.println("--------------");
        office.showInfo();

    }
}
