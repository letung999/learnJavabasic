package java_OOP;

public class Bai1_classAndObject {
    public static void main(String[] args) {
        Person person = new Person("Nguyen Van A","Quang Ngai", 19, "N18DCDT050");
        person.setFullName("Le Quang Tung");
        person.show();
    }

    static class Person {
        private String fullName;
        private String address;
        private int age;
        private String id;

        public Person(String fullName, String address, int age) {
            this.fullName = fullName;
            this.address = address;
            this.age = age;
        }

        public Person(String fullName, String address, int age, String id){
            this.fullName = fullName;
            this.address = address;
            this.age = age;
            this.id = id;
        }
        public void setFullName(String fullName){
            this.fullName = fullName;
        }

        public String getFullName(){
            return fullName;
        }

        public void show(){
            System.out.println("fullName: " + fullName+" Address: "+ address + "Age: "+ age + " Id: " + id);
        }

    }
}
