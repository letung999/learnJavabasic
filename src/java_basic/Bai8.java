package java_basic;
/*
String API
 */
public class Bai8 {
    public static void main(String[] args) {
        String myName = " Le Tung ";
        String name1 = "tung";
        String name2 = "TUNG";
        System.out.println(myName.trim());//bỏ các kí tự khoảng trắng đầu và cuối
        System.out.println(myName.toLowerCase());//chuyển tất cả các kí tự thành chữ thường
        System.out.println(myName.toUpperCase());//___________________________________hoa
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.compareToIgnoreCase(name2));
        String[] names = myName.split(" ");//tách các chuổi trong mảng
        for (var x: names) {
            System.out.println(x);
        }

    }
}
