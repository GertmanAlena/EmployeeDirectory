package groupEmployees;

import employ.Employee;
import java.util.List;

public interface EmployeeGroupInterface {

    boolean addEmployee(Integer personnelNumber, String name, String telephoneNumber, String experience);
    void showAllAmployees();
    boolean delAmployeesOfPersonnelNumber(Integer personnelNumber);
    List<Employee> searchByExperience(Integer min, Integer max);
    void print(List<Employee> list);
    List<Employee> searchByName(String name);
    List<Employee> searchByTelephoneNumber(String telephoneNumber);
}
