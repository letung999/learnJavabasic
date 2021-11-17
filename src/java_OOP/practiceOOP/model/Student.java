package java_OOP.practiceOOP.model;

import java.util.Objects;

public class Student extends Person {
    protected int studentID;
    private float mark;
    private String nameDepartment;
    public static int id = 1000;

    public Student() {

    }

    public Student(int studentID, float mark, String nameDepartment) {
        this.studentID = studentID;
        this.mark = mark;
        this.nameDepartment = nameDepartment;
    }

    public Student(String fullName, String address, String idPerson, int age, int studentID, float mark, String nameDepartment) {
        super(fullName, address, idPerson, age);
        this.studentID = studentID;
        this.mark = mark;
        this.nameDepartment = nameDepartment;
    }

    public void show() {

    }

    public void findHighestMark() {

    }

    public void sortMark() {

    }

    public void setStudentID() {
        this.studentID = id;
        id++;
    }

    public int getStudentID() {
        return this.studentID;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID
                && mark == student.mark
                && Objects.equals(nameDepartment, student.nameDepartment);
    }

    @Override
    public String toString() {
        return super.toString()+
                "studentID=" + studentID +
                ", mark=" + mark +
                ", nameDepartment='" + nameDepartment + '\'' +
                '}';
    }
}
