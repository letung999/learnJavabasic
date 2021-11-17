package java_OOP.practiceOOP.model;

import java.io.Serializable;
import java.util.Objects;

public class Employee extends Person implements Serializable, Comparable<Employee> {
    private String role;
    private float salary;
    private String nameAssignment;
    private int experience;

    public Employee() {

    }

    public Employee(String role, float salary, String nameAssignment, int experience) {
        this.role = role;
        this.salary = salary;
        this.nameAssignment = nameAssignment;
        this.experience = experience;
    }

    public Employee(String fullName, String address, String idPerson, int age, String role, float salary, String nameAssignment, int experience) {
        super(fullName, address, idPerson, age);
        this.role = role;
        this.salary = salary;
        this.nameAssignment = nameAssignment;
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getNameAssignment() {
        return nameAssignment;
    }

    public void setNameAssignment(String nameAssignment) {
        this.nameAssignment = nameAssignment;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void show() {
        super.show();
        System.out.println("Role is: " + role + "|Salary is: " + salary +
                "|nameAssignment is: " + nameAssignment + "|Experience is: " + experience);
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return experience == employee.experience
                && salary == employee.salary
                && Objects.equals(role, employee.role)
                && Objects.equals(nameAssignment, employee.nameAssignment);
    }

    public String toString() {
        return super.toString() + " Role='" + role + '\'' +
                ", salary='" + salary + '\'' +
                ", nameAssignment='" + nameAssignment + '\'' +
                ", Experience='" + experience + "\'";
    }

    @Override
    public int compareTo(Employee employee) {
//        float experiences = getExperience() - employee.getExperience();
//        if (experiences > 0) return 1;
//        if (experiences < 0) return -1;
//        return 0;
        String name = getFullName().substring(getFullName().lastIndexOf(" "));
        String nam1 = employee.getFullName().substring(employee.getFullName().lastIndexOf(" "));
        return name.compareTo(nam1);
    }
}
