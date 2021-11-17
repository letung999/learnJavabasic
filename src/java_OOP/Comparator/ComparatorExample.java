package java_OOP.Comparator;

import java_OOP.practiceOOP.model.Employee;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 21,
                "Leader",20,"controll Project", 5));
        list.add( new Employee("Le Quang Tung","Quang Ngai","212588533", 22,
                "Leader",120,"controll Project", 6));
        list.add(new Employee("Nguyen Hai Phong","Quang Ngai","212588533", 18,
                "Leader",10,"controll Project", 3));
        list.add(new Employee("La Quoc Hung","Quang Ngai","212588533", 25,
                "Leader",80,"controll Project", 7));
        System.out.println("Information before sort:\n");
        for (var x: list){
            System.out.println(x);
        }
        System.out.println("Sort By Name:\n");
        Collections.sort(list, new SortByName());
        for (var x: list){
            System.out.println(x);
        }
        System.out.println("Sort By Salary:\n");
        Collections.sort(list, new SortBySalary());
        for (var x: list){
            System.out.println(x);
        }

    }
}
