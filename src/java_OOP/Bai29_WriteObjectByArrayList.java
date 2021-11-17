package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Bai29_WriteObjectByArrayList {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 21,
                "Leader",120,"controll Project", 5));
        list.add( new Employee("Le Quang Tung","Quang Ngai","212588533", 22,
                "Leader",120,"controll Project", 6));
        list.add(new Employee("Nguyen Hai Phong","Quang Ngai","212588533", 18,
                "Leader",120,"controll Project", 3));
        list.add(new Employee("La Quoc Hung","Quang Ngai","212588533", 25,
                "Leader",120,"controll Project", 7));
        try {
            FileOutputStream fos = new FileOutputStream("listEmployee.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
