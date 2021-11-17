package java_basic;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("C:\\Users\\LB\\Documents\\test.txt"),"UTF-8");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();//đọc xong tất cả rồi mới đóng file
    }
}
