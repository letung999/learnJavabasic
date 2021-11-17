package java_OOP;

import java_OOP.practiceOOP.model.Person;
import java_OOP.practiceOOP.model.Student;

public class Bai21_abstract_abstractMethod {
    /**
     * Nêu ra vấn đề và để lớp con giải quyết vấn đề đó
     (nêu ra các phương thức nhưng chưa được định nghĩa, những viêc làm được nêu ra nhưng chưa thực hiện)
     mot lớp abstract thì không thể khởi tạo đối tượng,mà nó chỉ tham chiếu đến lớp con của nó
     */
    public static void main(String[] args) {
       // Person person = new Person();//mot lớp abstract thì không thể khởi tạo đối tượng
        Person person1 = new Student();//mà nó chỉ tham chiếu đến lớp con của nó


    }
}
