package nvb.dev.proxy.employee;

public class EmployeeTest {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final int AGE = 22;
    private static final boolean IS_EMPLOYED = false;

    public static void main(String[] args) {

        Office office = new ProxyOfficeRegistration(FIRST_NAME, LAST_NAME, AGE, IS_EMPLOYED);
        office.register();

    }
}
