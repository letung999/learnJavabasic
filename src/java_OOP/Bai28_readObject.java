package java_OOP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Bai28_readObject {
    public static void main(String[] args) {
        Object object;
        try {
            FileInputStream fis = new FileInputStream("employee.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available()>0){
                object = ois.readObject();
                System.out.println(object);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
