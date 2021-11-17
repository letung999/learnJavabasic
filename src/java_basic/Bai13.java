package java_basic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("fileWrite");
        printWriter.append("Le");
        printWriter.append("Quang");
        printWriter.append("Tung");
        printWriter.close();
        int a = 10;
        int b = 5;
        System.out.println(a - b);
    }
}
