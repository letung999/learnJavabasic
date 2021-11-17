package java_basic;

import java.util.Random;

public class Bai16 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i<10; ++i){
            int x = random.nextInt(46) + 15;
            System.out.println(x + " ");
        }
    }
}
