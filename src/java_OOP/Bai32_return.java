package java_OOP;

public class Bai32_return {
    /**
     * trả về một giá trị của một phương thức khi kết thúc chương trình
     * kết thúc phương thức
     * có thể nó ko phải là lệnh cuối cùng nhưng bắt buộc nó phải lệnh được thực hiện cuối cùng
     */
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        int a= 200;
        int b = 1;
        if((a + b) % 10 == 0) return;
        else System.out.println(a + b);
    }


}
