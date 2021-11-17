package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;

import java.util.logging.Logger;

public class Bai24_StringMethod {
    /**
     * tạo ra một xâu kí tự đại diện cho  đối tượng hiện tại của một lớp
     *
     */
    public static void main(String[] args) {

        Person person = new Person("Nguyen Hoai Nam","Quang Ngai","212588533", 20);
        Person employee = new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 20,
                "Leader",120,"controll Project", 5);

        System.out.println(person);
        System.out.println(employee);

        Logger.getGlobal().info(person.toString());
        Logger.getGlobal().info(employee.toString());
    }
}
