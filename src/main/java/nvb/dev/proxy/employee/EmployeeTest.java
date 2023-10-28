package nvb.dev.proxy.employee;

public class EmployeeTest {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final int AGE = 18;
    private static final boolean IS_EMPLOYED = true;

    public static void main(String[] args) {

        Employee employee = new Employee.Builder(AGE, IS_EMPLOYED)
                .setFirstName(FIRST_NAME)
                .setLastName(LAST_NAME)
                .build();

        Office office = new ProxyOfficeRegistration(employee);
        office.register();

    }
}
