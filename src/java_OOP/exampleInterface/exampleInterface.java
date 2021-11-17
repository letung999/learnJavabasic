package java_OOP.exampleInterface;

public class exampleInterface {
    /**
     * đạt được tính trừu tượng hoàn toàn
     * cũng giống như abstract class được nêu ra nhưng chưa được định nghĩa
     * abstract: liên quan đến kế thừa extend
     * interface: liên quan đến keyword implement
     * nếu một lớp không implement hết tát cả các phương thức thì lớp đó phải là lớp abstract
     * một class nó chỉ extends một lớp nhưng nó có thể implement nhiều lớp
     * một interface thì nó đa kế thừa tức nó có thể extend nhiều lớp(một interface thì nó cơ thê extend nhiều interface
     */
    public static void main(String[] args) {
       Animal animal = new Fish();//vì nó là một abstract nên nó không thể khởi tạo đối tượng
        // cho chính nó nhưng nó có thể tham chiêu
        //đến các lớp con của nó và đó chính là thể hiện tính đa hình
       Animal animal1 = new Cat();
       Animal animal2 = new Dog();
        System.out.println("information for Fish");
       animal.eat();
       animal.move();
       animal.sleep();
    }
}
