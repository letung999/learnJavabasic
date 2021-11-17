package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;
/**
 * Đa hình là nói đến một đối tượng nào đó có khả năng nhập vai thành các đối tượng khác.
 * Vậy thì để mà một đối tượng có thể là một đối tượng nào đó, ắt hẳn nó phải là đối tượng cha.
 * Và để đối tượng cha có thể là một trong các đối tượng con ở từng hoàn cảnh,
 * thì nó phải định nghĩa ra các phương thức để con của nó có thể ghi đè.
 * Điều này giúp hệ thống xác định được đối tượng nào và phương thức nào thực sự đang hoạt động
   khi ứng dụng đang chạy.

 */

public class Bai17_Polymorphism {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Hoai Nam","Quang Ngai","212588533", 20);
        Person employee = new Employee("Nguyen Hoai Nam","Quang Ngai","212588533", 20,
                "Leader",120,"controll Project", 5);//đối tượng của lớp cha hoàn
        //toàn có thể tham chiếu đến đối tượng của lớp con
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = employee;
        for (var p:people) {
            p.show();
        }
    }
}
