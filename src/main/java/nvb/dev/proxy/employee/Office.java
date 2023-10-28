package nvb.dev.proxy.employee;

import java.util.List;

public interface Office {

    List<Employee> addEmployee(Employee newEmployee);

    String getFirstName();

    String getDepartment();

    void showInfo();

}
