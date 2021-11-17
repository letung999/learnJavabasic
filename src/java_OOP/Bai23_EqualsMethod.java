package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;

public class Bai23_EqualsMethod {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Hoai Nam","Quang Ngai","212588533", 20);
        Employee employee = new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 20,
                "Leader",120,"controll Project", 5);
        Person person1 = new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 20,
                "Leader",120,"controll Project", 5);

        System.out.println(person.equals(employee));

        System.out.println(person1.equals(employee));



    }
}
