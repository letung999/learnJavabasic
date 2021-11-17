package java_OOP;

import java_OOP.practiceOOP.model.Student;

public class Bai6_Variable_objectVariable {
    /*
    -Đối tượng được tạo ra với keyworld new,
    -Biến đối tượng là biến có kiểu là tên các class,
     muốn dùng được thì nó phải tham chiếu đến một đối tượng nào đó
     */
    public static void main(String[] args) {
        new Student();//đối tượng
        Student student;//biến đối tượng
        Student student1 = new Student();//tham chiếu đến một đối tượng cụ thể để được sử dụng được
        student1.findHighestMark();//truy xuất đến các phần tử mảng
    }
}
