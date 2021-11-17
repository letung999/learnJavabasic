package java_basic;

public class Bai18 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        //duyet mang bang for
        for(int i = 0; i<arr.length; ++i){
            for(int j = 0; j < arr[0].length; ++j){
                System.out.print(arr[1][2]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //duyet mang bang foreach
        for (var x:arr) {
            for (var y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
