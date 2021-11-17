package java_OOP.Comparator;

import java_OOP.practiceOOP.model.Employee;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        float s1 = employee.getSalary();
        float s2 = t1.getSalary();
        float res = s1 - s2;
        if(res > 0) return 1;
        if(res < 0) return -1;
        System.out.println();
        return 0;

    }
}
