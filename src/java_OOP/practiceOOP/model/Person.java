package java_OOP.practiceOOP.model;

import java.io.Serializable;
import java.util.Objects;

public /*abstract*/ class Person implements Serializable {
    private String fullName;
    private String address;
    private String idPerson;
    private int age;

    public Person() {

    }

    public Person(String fullName, String address, String idPerson, int age) {
        this.fullName = fullName;
        this.address = address;
        this.idPerson = idPerson;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        //splitName();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void splitName() {
        String[] names = fullName.split(" ");
        this.fullName = "firstName: " + names[0] + ", SecondName: " + names[1] + ", LastName: " + names[2];
    }

    public void show(){
        System.out.println("fullName is: "+ fullName +"|Address is: "+ address +
                "|IdPerson is: "+ idPerson+"|Age is: "+ age);
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return person.age == age
                && Objects.equals(fullName,person.fullName)
                && Objects.equals(address, person.address)
                && Objects.equals(idPerson, person.idPerson);
    }

    @Override
    public String toString() {
        return getClass().getName()+ "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", idPerson='" + idPerson + '\'' +
                ", age=" + age;
    }
}