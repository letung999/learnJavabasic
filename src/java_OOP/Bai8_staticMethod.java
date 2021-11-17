package java_OOP;

public class Bai8_staticMethod {
    private String something = "Something";
    private static String otherSomething ="otherSomething";
    public static void main(String[] args) {
       // System.out.println(something); /*vì thuộc tính trên không phải là static nên không thể gọi trong main/*
        System.out.println(otherSomething);
    }
}
