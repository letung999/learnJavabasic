package java_OOP;

import java_OOP.practiceOOP.model.Person;

public class Bai9_public {
    public static void main(String[] args) {
        /*
        là những thành phần có thể thấy được
        là những thành phần dùng chung
        các lớp khác có thể truy cập được
         */
        Person person = new Person();
        //System.out.println(person.fullName);không thể truy cập được vì thuộc tính thuộc thành phần private
    }
}
