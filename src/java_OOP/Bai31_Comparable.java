package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Bai31_Comparable {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 21,
                "Leader",120,"controll Project", 5));
        list.add( new Employee("Le Quang Tung","Quang Ngai","212588533", 22,
                "Leader",120,"controll Project", 6));
        list.add(new Employee("Nguyen Hai Phong","Quang Ngai","212588533", 18,
                "Leader",120,"controll Project", 3));
        list.add(new Employee("La Quoc Hung","Quang Ngai","212588533", 25,
                "Leader",120,"controll Project", 7));
        System.out.println("Information before sort\n");
        for (var x: list){
            System.out.println(x);
        }
        Collections.sort(list);
        System.out.println("Information after sort\n");
        for (var x: list){
            System.out.println(x);
        }

    }
}
