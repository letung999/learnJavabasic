package java_basic;

public class Bai17 {
    public static void main(String[] args) {
        //chi so cua mang luon nam tu 0-n-1
        int[] arr ={1,2,3,4,5};
        for(int i = 0; i<arr.length; ++i){
            System.out.println(arr[i]);
        }
        //duyet bang vong lap foreach
        System.out.println("______________________________________________");
        arr[3] = 100;
        for (var x:arr) {
            System.out.println(x);
        }
    }
}
