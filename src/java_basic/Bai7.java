package java_basic;

public class Bai7 {
    public static void main(String[] args) {
        String name = "Le Quang Tung";
        //tach mang tu cac chuoi con
        String[] names = name.split(" ");
        for (var x : names) {
            System.out.println(x);
        }
        //lay chuoi con
        String names1 = name.substring(9, 13);
        String names2 = name.substring(3, 9);
        System.out.println(names1);
        //noi chuoi
        String myName = names2 + names1;
        System.out.println(myName);
        //String là bất biến trong java, không thể thay đổi bất kỳ kí tự đã được định nghĩa
        for(int i = 0; i < name.length()-1; ++i){
            System.out.println(name.charAt(i));//in ra một kí tự tren một hàng
        }
        //so sánh các chuối với nhau
        String name1 = "TUNG";
        String name2 ="tung";
        System.out.println(name1.equals(name2));//so sánh phân biệt hoa thường
        System.out.println(name2.equalsIgnoreCase(name2));//so sánh không phân biệt hoa thường

    }
}
