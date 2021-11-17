package java_OOP.exampleInterface;

public class Fish implements Animal {
    @Override
    public void move() {
        System.out.println("move fast");
    }

    @Override
    public void sleep() {
        System.out.println("fish sleep and stop at");
    }

    @Override
    public void eat() {
        System.out.println("...");
    }
}
