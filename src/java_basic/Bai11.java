package java_basic;

public class Bai11 {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 3;
        int c = 10;
        double res = 1.0 * a / b;
        System.out.printf("result = %10.2f", res);//10.2f: lấy 10 vị trí để in phần thực và lấy 2 chữ số phần thập phân
        System.out.printf("\nresult = %,1.2f", res);//10.2f: lấy 10 vị trí để in phần thực và lấy 2 chữ số phần thập phân,
        // có phân tách nếu gặp phần nghìn
        System.out.printf("\nresult = %-10.2f%n", res);
        System.out.printf("c = %03d", c);
    }
}
