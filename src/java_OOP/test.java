package java_OOP;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date;
        Date date1 = new Date();
        date = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date1 = simpleDateFormat.parse(date);
            Long time = date1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
