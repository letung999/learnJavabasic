package java_OOP;

import java_OOP.practiceOOP.model.Student;

public class Bai5_this {
    /*
    Trong một class nếu tên thuộc tính trùng với tham số truyền vào thì ta phai dùng con trỏ this để xác định rõ,
    nếu ko nó sẽ ưu tiên sử dụng tên tham số
     */
    public static void main(String[] args) {
        Student student = new Student(100,9.8f,"Cong Nghe Thong Tin");
        System.out.println(student.getStudentID());
    }
}
