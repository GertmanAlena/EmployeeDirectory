package presenter;

import groupEmployees.EmployeeGroup;
import groupEmployees.EmployeeGroupInterface;

public class Presenter {

    EmployeeGroupInterface employeeGroup = new EmployeeGroup();

    public void showAllAmployees() {
        employeeGroup.showAllAmployees();
    }

    public void addEmployee(Integer ID, String name, String telephone, String experience) {
        employeeGroup.addEmployee(ID, name, telephone, experience);
    }

    public void delAmployeesOfPersonnelNumber(Integer personnelNumber) {
        employeeGroup.delAmployeesOfPersonnelNumber(personnelNumber);
    }

    public void searchByExperience(Integer min, Integer max) {
        employeeGroup.print(employeeGroup.searchByExperience(min, max));

    }

    public void searchByTelephoneNumber(String telephone) {
        employeeGroup.print(employeeGroup.searchByTelephoneNumber(telephone));
    }

    public void searchByName(String name) {
        employeeGroup.print(employeeGroup.searchByName(name));
    }
}
