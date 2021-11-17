package java_basic;

public class Bai15 {
    public static void main(String[] args) {
        for(int i = 1; i<100; ++i){
            if(i % 10 == 0){
                break;
                //continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
