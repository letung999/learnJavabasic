package java_OOP;

import java_OOP.practiceOOP.model.Student;

public class Bai7_static_finalStatic {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID();
        Student student1 = new Student();
        student1.setStudentID();
        Student student2 = new Student();
        student2.setStudentID();
        Student student3= new Student();
        student3.setStudentID();
        Student student4= new Student();
        student4.setStudentID();

        System.out.println(student.getStudentID());
        System.out.println(student1.getStudentID());
        System.out.println(student2.getStudentID());
        System.out.println(student3.getStudentID());
        System.out.println(student4.getStudentID());
    }
}
