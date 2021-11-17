package java_OOP.practiceOOP.model.OOP2.controller;

import java_OOP.practiceOOP.model.OOP2.model.Student;
import java_OOP.practiceOOP.model.OOP2.model.StudentRegister;
import java_OOP.practiceOOP.model.OOP2.model.Subject;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeFileAfterWrite(String fileName){

        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeSubjectToFile(Subject subject,String fileName){
        //subjectID, subjectName, totalLesson, subjectType
        openFileToWrite(fileName);
        printWriter.println(subject.getSubjectID()+"|"+subject.getSubjectName()+
                "|"+subject.getTotalLesson()+"|"+subject.getSubjectType());
        closeFileAfterWrite(fileName);
    }

    public void writeStudentToFile(Student student, String fileName){
        //(studentID, fullName, address, phoneNumber
        openFileToWrite(fileName);
        printWriter.println(student.getStudentID()+"|"+ student.getFullName()+"|"+student.getAddress()+"|"+student.getPhoneNumber());
        closeFileAfterWrite(fileName);
    }

    public void writeStudentRegister(StudentRegister studentRegister, String fileName){
        // Student student, Subject subject, int numOfRegister, String date
        openFileToWrite(fileName);
        printWriter.println(studentRegister.getStudent().getStudentID()+"|"
                +studentRegister.getSubject().getSubjectID()+"|"+studentRegister.getNumOfRegister()+"|"+studentRegister.getDate());
        closeFileAfterWrite(fileName);
    }

    public void openFileToRead(String fileName){
        try {
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName),"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileAfterRead(String fileName){
        scanner.close();
    }
    public ArrayList<Subject> readSubjectFromFile(String fileName){
        ArrayList<Subject> subjects = new ArrayList<>();
        openFileToRead(fileName);
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            Subject subject = createSubjectData(data);
            subjects.add(subject);
        }
        closeFileAfterRead(fileName);
        return subjects;
    }

    private Subject createSubjectData(String data) {
        //int subjectID, String subjectName, int totalLesson, String subjectType
        String[]datas = data.split("\\|");
        Subject subject = new Subject(Integer.parseInt(datas[0]),datas[1],Integer.parseInt(datas[2]),datas[3]);
        return subject;
    }

    public ArrayList<Student> readStudentFromFile(String fileName){
        ArrayList<Student> students = new ArrayList<>();
        openFileToRead(fileName);
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            Student student = createStudentData(data);
            students.add(student);
        }
        closeFileAfterRead(fileName);
        return students;
    }

    private Student createStudentData(String data) {
        //int studentID,String fullName, String address, String phoneNumber
        String[]datas = data.split("\\|");
        Student student = new Student(Integer.parseInt(datas[0]),datas[1],datas[2],datas[3]);
        return student;
    }

    public ArrayList<StudentRegister> readStudentRegisterFromFile(String fileName){
        ArrayList<StudentRegister> studentRegisters = new ArrayList<>();
        var subjects = readSubjectFromFile("SB.DAT");
        var students = readStudentFromFile("ST.DAT");
        openFileToRead(fileName);
        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            StudentRegister studentRegister = createStudentRegisterData(data,students,subjects);
            studentRegisters.add(studentRegister);
        }
        closeFileAfterRead(fileName);
        return studentRegisters;
    }

    private StudentRegister createStudentRegisterData(String data, ArrayList<Student> students, ArrayList<Subject> subjects) {
       // Student student, Subject subject, int numOfRegister, String date
        String[] datas = data.split("\\|");
        StudentRegister studentRegister = new StudentRegister(getStudent( students,(Integer.parseInt(datas[0])))
                ,getSubject(subjects,Integer.parseInt(datas[1])),Integer.parseInt(datas[2]),datas[3]);
        return studentRegister;
    }

    public void updateFile(ArrayList<StudentRegister> studentRegisters, String studentFileName) {
        File file = new File(studentFileName);
        if(file.exists()){
            file.delete();
        }
        for(int i = 0; i< studentRegisters.size(); ++i){
            openFileToWrite(studentFileName);
            printWriter.println(studentRegisters.get(i).getStudent().getStudentID()+"|"
                    +studentRegisters.get(i).getSubject().getSubjectID()+"|"+studentRegisters.get(i).getNumOfRegister()
                    +"|"+studentRegisters.get(i).getDate());
            closeFileAfterWrite(studentFileName);
        }
    }
    private static Subject getSubject(ArrayList<Subject> subjects, int subjectID) {
        for (int i = 0; i < subjects.size(); ++i) {
            if (subjects.get(i).getSubjectID() == subjectID) {
                return subjects.get(i);
            }
        }
        return null;
    }

    private static Student getStudent(ArrayList<Student> students, int studentID) {
        for (int i = 0; i < students.size(); ++i) {
            if (students.get(i).getStudentID() == studentID) {
                return students.get(i);
            }
        }
        return null;
    }
}
