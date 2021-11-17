package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;
/**
 * ép kiểu từ đối tượng của lớp cha xuống đối tượng của lớp con
 * để sự dụng đầy đủ tính năng của một lớp nào đó
 */
public class Bai18_DowCasting {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Hoai Nam","Quang Ngai","212588533", 20);
        Person employee = new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 20,
                "Leader",120,"controll Project", 5);//đối tượng của lớp cha hoàn
        //toàn có thể tham chiếu đến đối tượng của lớp con
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = employee;
        Person p1 = null;
        Employee e1 = null;
        //vi du chi nhung thang nao la employee thi mới được in ra chẳng hạng;
        for (var p: people) {
            if(p instanceof Employee){//nếu p là một biến đối tượng tham chiếu đến Đối tượng Student
                e1 = (Employee) p;
            }
        }
        if(e1 != null){
            e1.setFullName("Le Quang Tung");
            e1.show();
        }
    }
}
