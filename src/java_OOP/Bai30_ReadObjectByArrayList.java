package java_OOP;

import java_OOP.practiceOOP.model.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai30_ReadObjectByArrayList {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("listEmployee.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Person>) ois.readObject();
            for (var x: list) {
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
