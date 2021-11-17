package java_basic;

public class Bai1 {
    public static void main(String[] args) {
        System.out.printf("TYPE: %-25s SIZE: %-15s MIN: %-20s MAX: %-20s",
                Integer.TYPE, Integer.SIZE,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("\nTYPE: %-25s SIZE: %-15s MIN: %-20s MAX: %-20s",
                Short.TYPE, Short.SIZE,Short.MIN_VALUE,Short.MAX_VALUE);
        System.out.printf("\nTYPE: %-25s SIZE: %-15s MIN: %-20s MAX: %-20s",
                Float.TYPE, Float.SIZE,Float.MIN_VALUE,Float.MAX_VALUE);
        System.out.printf("\nTYPE: %-25s SIZE: %-15s MIN: %-20s MAX: %-20s",
                Double.TYPE, Double.SIZE,Double.MIN_VALUE,Double.MAX_VALUE);
        System.out.printf("\nTYPE: %-25s SIZE: %-15s MIN: %-20s MAX: %-20s",
                Long.TYPE, Long.SIZE,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
