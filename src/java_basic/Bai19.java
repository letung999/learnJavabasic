package java_basic;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input num Of Element");
        int n = scanner.nextInt();
        int[]arr = inputArr(n);
        System.out.println("Input Name");
        scanner.nextLine();
        String name = scanner.nextLine();
        inputArrLine(name);

    }
    public static int[] inputArr(int n){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new  int [n];
        for(int i = 0; i < n; ++i){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void inputArrLine(String name){
        String[] names = name.split(" ");
        for ( var x: names) {
            System.out.println(x);
        }
    }

}
