package java_basic;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so");
        int a = scanner.nextInt();
        System.out.println("Nhap vao mot so thưc");
        float b = scanner.nextFloat();
        System.out.println("Nhap vao mot ki tu");
        char c = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Nhap vao mot dong");//đọc luôn cả kí tự xuống dòng
        String d = scanner.nextLine();
        double e = scanner.nextDouble();
    }
}
