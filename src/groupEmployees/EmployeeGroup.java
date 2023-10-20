package groupEmployees;

import employ.Employee;

import java.util.*;

public class EmployeeGroup implements EmployeeGroupInterface{
    Map<Integer, Employee> employeeMap;
    List<Employee> employeeList;

    /**
     * Метод добавления нового работника
     * @param personnelNumber табельный номер как ключ для Map и значение в Employee
     * @param name имя сотруднкиа
     * @param telephoneNumber телефон сотруднкиа
     * @param experience стаж сотруднкиа
     * @return
     */
    @Override
    public boolean addEmployee(Integer personnelNumber, String name, String telephoneNumber, String experience) {
        if (employeeMap == null){
            employeeMap = new HashMap<>();
        }
        employeeMap.put(personnelNumber, new Employee(personnelNumber, name, telephoneNumber, experience));
        return true;
    }

    /**
     * Метод для вывода всех сотрудников Map
     */
    @Override
    public void showAllAmployees(){
        if(employeeMap == null){
            System.out.println("В списке никого нет" + "\n");
        } else System.out.println(employeeMap);
    }

    /**
     * Метод поиска сотрудника по персональному номеру
     * @param personnelNumber персональный номер
     * @return
     */
    @Override
    public boolean delAmployeesOfPersonnelNumber(Integer personnelNumber){
        if(employeeMap == null){
            System.out.println("В списке никого нет" + "\n");
            return false;
        } else {
            employeeMap.remove(personnelNumber);
            return true;
        }
    }

    /**
     * Метод поиска сотрудника по стажу от min до max
     * @param min минимальное значение стажа
     * @param max максимольное значение стажа
     * @return
     */
    @Override
    public List<Employee> searchByExperience(Integer min, Integer max){
        if(employeeMap == null){
            System.out.println("В списке никого нет" + "\n");
            return null;
        } else {
            Iterator<Map.Entry<Integer, Employee>> entries = employeeMap.entrySet().iterator();
            employeeList = new ArrayList<>();
            int index = 0;
            while (entries.hasNext()) {
                Map.Entry<Integer, Employee> entry = entries.next();
                if(Integer.parseInt(entry.getValue().getExperience().split(" ")[0]) > min &&
                        Integer.parseInt(entry.getValue().getExperience().split(" ")[0]) < max){
                    employeeList.add(index, entry.getValue());
                }
            }
        }
        return employeeList;
    }

    /**
     * Метод поиска сотрудника по имени
     * @param name имя
     * @return
     */
    @Override
    public List<Employee> searchByName(String name){
        if(employeeMap == null){
            System.out.println("В списке никого нет" + "\n");
            return null;
        } else {
            Iterator<Map.Entry<Integer, Employee>> entries = employeeMap.entrySet().iterator();
            employeeList = new ArrayList<>();
            int index = 0;
            while (entries.hasNext()) {
                Map.Entry<Integer, Employee> entry = entries.next();
                if(Objects.equals(entry.getValue().getName(), name)){
                    employeeList.add(index, entry.getValue());
                }
            }
        }
        return employeeList;
    }

    /**
     * Метод поиска сотрудника по номеру телефона
     * @param telephoneNumber
     * @return
     */
    @Override
    public List<Employee> searchByTelephoneNumber(String telephoneNumber){
        if(employeeMap == null){
            System.out.println("В списке никого нет" + "\n");
            return null;
        } else {
            Iterator<Map.Entry<Integer, Employee>> entries = employeeMap.entrySet().iterator();
            employeeList = new ArrayList<>();
            int index = 0;
            while (entries.hasNext()) {
                Map.Entry<Integer, Employee> entry = entries.next();
                if(Objects.equals(entry.getValue().getTelephoneNumber(), telephoneNumber)){
                    employeeList.add(index, entry.getValue());
                }
            }
        }
        return employeeList;
    }

    public void print(List<Employee> list){
        if (list.isEmpty()){
            System.out.println("Список пуст");
        } else{
            for (Employee em: list) {
                System.out.println("найдено " + em);
            }
        }
    }
}
