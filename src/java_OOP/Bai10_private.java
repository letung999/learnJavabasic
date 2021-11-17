package java_OOP;

import java_OOP.practiceOOP.model.Person;

public class Bai10_private {
    /*
    -tính đóng gói dữ liệu
    ->là những thành phần chỉ được sử dụng nội bộ trong một class
     */
    public static void main(String[] args) {
        Person person = new Person("Nguyen Hoai Nam","Quang Ngai","212588533", 19);
        person.setFullName("Nguyen Hoai Nam");
        System.out.println(person.getFullName());
    }
}
