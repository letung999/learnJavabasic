package java_basic;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, a, b;
        do {
            System.out.println("input a, b\n");
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("***************************Menu***************************\n");
            System.out.println("1.plus two number");
            System.out.println("2.subtract");
            System.out.println("3.divide two number");
            System.out.println("4.multiply");
            System.out.println("0.exit");
            System.out.println("your Option?");
            x = scanner.nextInt();
            switch (x){
                case 0:{
                    System.out.println("see you soon!");
                    break;
                }
                case 1:{
                    System.out.printf(a + " + " + b +" = "+ a + b);
                    break;
                }
                case 2:{
                    System.out.println(a-b);
                    break;
                }
                case 3:{
                    System.out.println(a + " * " + b +" = "+ a * b);
                    break;
                }
                case 4:{
                    System.out.println(a + " / " + b +" = "+ (float)a*1.0 / b);
                    int c = 2;
                    int d = 1;
                    break;

                }

            }
        }while (x != 0);
    }
}
