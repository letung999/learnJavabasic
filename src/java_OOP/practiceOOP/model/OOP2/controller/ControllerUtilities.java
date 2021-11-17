package java_OOP.practiceOOP.model.OOP2.controller;

import java_OOP.practiceOOP.model.OOP2.model.Student;
import java_OOP.practiceOOP.model.OOP2.model.StudentRegister;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControllerUtilities {

    public ArrayList<StudentRegister> updateFile(ArrayList<StudentRegister> studentRegisters, StudentRegister studentRegister) {
        boolean isUpdate = false;
        for (int i = 0; i < studentRegisters.size(); ++i) {
            if (studentRegister.getStudent().getStudentID() == studentRegisters.get(i).getStudent().getStudentID()
                    && studentRegister.getSubject().getSubjectID() == studentRegisters.get(i).getSubject().getSubjectID()) {
                isUpdate = true;
                studentRegisters.set(i, studentRegister);
            }
        }
        if (isUpdate == false) {
            studentRegisters.add(studentRegister);
        }
        return studentRegisters;
    }
//kieeu dodi tuong thi khong the tham chieeu truoc tieeps ddeen kieu con dduoc
    public void sortByName(ArrayList<StudentRegister> studentRegisters) {
        for (int i = 0; i < studentRegisters.size(); ++i) {
            for (int j = studentRegisters.size() - 1; j > 0; j--) {
                StudentRegister sj = studentRegisters.get(j);
                StudentRegister sjj = studentRegisters.get(j - 1);
                if (sj.getStudent().getFullName().substring(sj.getStudent().getFullName().lastIndexOf(" "))
                        .compareTo(sjj.getStudent().getFullName().substring(sjj.getStudent().getFullName().lastIndexOf(" "))) < 0) {
                    studentRegisters.set(j - 1, sj);
                    studentRegisters.set(j, sjj);
                }
            }
        }
    }

    public void sortByDate(ArrayList<StudentRegister> studentRegisters) {
        Date date1, date2;
        Long time1, time2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < studentRegisters.size(); ++i) {
            for (int j = studentRegisters.size() - 1; j > 0; j--) {
                StudentRegister sj = studentRegisters.get(j);
                StudentRegister sjj = studentRegisters.get(j - 1);
                try {
                    date1 = simpleDateFormat.parse(sj.getDate());
                    date2 = simpleDateFormat.parse(sjj.getDate());
                    time1 = date1.getTime();
                    time2 = date2.getTime();
                    if (time1 < time2) {
                        studentRegisters.set(j - 1, sj);
                        studentRegisters.set(j, sjj);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public ArrayList<StudentRegister> createListRegister(ArrayList<StudentRegister>studentRegisters){
        int count = 0;
        StudentRegister studentRegister = studentRegisters.get(0);
        for(int i = 0; i<studentRegisters.size(); ++i){
            if(studentRegister.getStudent().getStudentID() != studentRegisters.get(i).getStudent().getStudentID()){
                ++count;
                studentRegisters.add(studentRegisters.get(i));
            }
            if(count == 2){
                break;
            }
        }
        return studentRegisters;
    }
    public void dem(ArrayList<StudentRegister>studentRegisters){
        int count = 0;
        StudentRegister studentRegister = studentRegisters.get(0);
        for(int i = 0; i<studentRegisters.size(); ++i){
            if(studentRegister.getStudent().getStudentID() != studentRegisters.get(i).getStudent().getStudentID()){
                ++count;
            }
        }
        System.out.println(count);
    }

}
