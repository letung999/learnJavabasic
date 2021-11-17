package java_basic.PracticeHackerrank;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i<t; ++i){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int s = 0;
            for(int j = 0; j<n; ++j){
                s = s + b * (int)Math.pow(2,j);
                System.out.print(a + s + " ");
            }
        }
    }
}
