package java_OOP.exampleInterface;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("run by 4 legs");
    }

    @Override
    public void sleep() {
        System.out.println("often sleep in kitchen");
    }

    @Override
    public void eat() {
        System.out.println("cat eat mouse");
    }
}
