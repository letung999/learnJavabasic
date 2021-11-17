package java_OOP;

import java_OOP.practiceOOP.model.Employee;
import java_OOP.practiceOOP.model.Person;

public class Bai16_Override {
    /**
     *Định nghĩa lại phương thức của lớp cha sao cho phù hợp với lớp con về chức năng ý nghĩa
     *Chỉ diễn ra trong quan hệ kế thừa
     *khác với overload:nạp chồng lại các phương thức có trong cùng một lớp
     */
    public static void main(String[] args) {
        Person person = new Person("Nguyen Hoai Nam","Quang Nam","212588533",28);
        Employee employee = new Employee("Le Quang Tung","Quang Ngai","212588544",28,
        "TechnicalArchitech", 100f,"desinerSystem",4);
        employee.show();
    }
}
