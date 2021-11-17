package java_OOP;

import java_OOP.practiceOOP.model.Person;

import java.util.ArrayList;

public class Bai26_ArrayList {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Hoai Nam","Quang Ngai","212588533", 20);
        ArrayList list = new ArrayList();//nó có thể lưu tất các kiểu dữ liệu, nên trước hết ta phải xác định kiêu lưu trữ
        list.add("one");//thêm một phần tử vào mảng
        list.add(1);
        list.add(2);
        list.add(true);
        list.set(1, "ones");
        list.get(3);//lấy ra một phần tử tại vị trí nào đó
        list.remove(2);//xoa phần tử tại vị trí nào đó
        System.out.println("size Of List: " + list.size());//sô lượng phần tử mảng
        list.add(person);
        for (var x: list) {
            System.out.println(x);
        }
        System.out.println();
    }
}
