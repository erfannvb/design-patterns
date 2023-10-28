package nvb.dev.proxy.employee;

import java.time.LocalDate;

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
        office.register();

        System.out.println("--------------");
        System.out.println("Name : " + office.getFirstName());
        System.out.println("Department : " + office.getDepartment());

        System.out.println("--------------");
        office.showInfo();

    }
}
