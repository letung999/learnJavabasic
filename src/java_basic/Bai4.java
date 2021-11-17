package java_basic;

public class Bai4 {
    /*
    toan tu so hoc: +,-,*,/
    toan tu gan:/=, +=, *=, -=;
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double res = (10 * 1.0) / 3;
        int div = 10 % 3;
        System.out.println(res);
        System.out.println(div);
        res += 100;
        System.out.println(res);
        String result = "";
        result = a > b ? "a > b" : "a < b";
        System.out.println(result);

    }
}
