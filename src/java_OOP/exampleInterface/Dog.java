package java_OOP.exampleInterface;

public  class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("move by 4 legs and very fast");
    }

    @Override
    public void sleep() {
        System.out.println("sleep adorable");
    }

    @Override
    public void eat() {
        System.out.println("eat rice");
    }
}
