package java_OOP.Comparator;

import java_OOP.practiceOOP.model.Employee;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        String name1 = employee.getFullName().substring(employee.getFullName().lastIndexOf(" "));
        String name2 = t1.getFullName().substring(t1.getFullName().lastIndexOf(" "));
        return name1.compareTo(name2);
    }
}
