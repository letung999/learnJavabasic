package java_basic;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Mark");
        float mark = scanner.nextFloat();
        if(mark >= 8){
            System.out.println(testEnum.GIOI);
        }
        else {
            if(mark >= 6.5 && mark <8){
                System.out.println(testEnum.KHA);
            }
            else {
                if(mark >=5 && mark < 6.5){
                    System.out.println(testEnum.TRUNGBINH);
                }
                else {
                    System.out.println(testEnum.KEM);
                }
            }
        }
    }
}
