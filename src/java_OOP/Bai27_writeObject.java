package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Bai27_writeObject {
    public static void main(String[] args) {
        ArrayList list =  new ArrayList();
        Person employee = new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 21,
                "Leader",120,"controll Project", 5);
        Person employee1 = new Employee("Le Quang Tung","Quang Ngai","212588533", 22,
                "Leader",120,"controll Project", 6);
        Person employee2 = new Employee("Nguyen Hai Phong","Quang Ngai","212588533", 18,
                "Leader",120,"controll Project", 3);
        Person employee3 = new Employee("La Quoc Hung","Quang Ngai","212588533", 25,
                "Leader",120,"controll Project", 7);
        try {
            FileOutputStream fos = new FileOutputStream("employee.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.writeObject(employee2);
            oos.writeObject(employee3);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
