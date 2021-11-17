package java_OOP.practiceOOP.model.OOP2.view;

import java_OOP.practiceOOP.model.OOP2.controller.ControllerUtilities;
import java_OOP.practiceOOP.model.OOP2.controller.DataController;
import java_OOP.practiceOOP.model.OOP2.model.Student;
import java_OOP.practiceOOP.model.OOP2.model.StudentRegister;
import java_OOP.practiceOOP.model.OOP2.model.Subject;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {
    public static void main(String[] args) {
        var studentFileName = "ST.DAT";
        var subjectFileName = "SB.DAT";
        var studentRegisterFileName = "SR.DAT";
        var dataController = new DataController();
        var controllerUtilities = new ControllerUtilities();
        var scanner = new Scanner(System.in);
        var subjects = new ArrayList<Subject>();
        var students = new ArrayList<Student>();
        var studentRegisters = new ArrayList<StudentRegister>();
        ArrayList arrayList = new ArrayList();
        int choose;
        do {
            System.out.println("*************************MENU*************************");
            System.out.println("1.add Subject In File");
            System.out.println("2.show Information Subject In File");
            System.out.println("3.add Student In File");
            System.out.println("4.show Information Student In File");
            System.out.println("5.Contribute Information StudentRegister");
            System.out.println("6.Sort Information");
            System.out.println("7.add Student in List");
            System.out.println("0.exit");
            System.out.println("you choose?");
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 0: {
                    System.out.println("exit");
                    break;
                }
                case 1: {
                    //int subjectID, String subjectName, int totalLesson, String subjectType
                    checkSubjectID(dataController, subjectFileName);
                    String subjectName, subjectType;
                    int totalLesson, sb;
                    System.out.println("Input Subject Name");
                    subjectName = scanner.nextLine();
                    System.out.println("Input totalLesson");
                    totalLesson = scanner.nextInt();
                    String[] subjectss = {"General", "specializations", "base", "compulsory majors", "specialization options"};
                    do {
                        System.out.println("Input subjectType");
                        System.out.println("1.General\n2.specializations base\n3.compulsory majors\n4.specialization options");
                        System.out.println("you choose!");
                        sb = scanner.nextInt();
                        subjectType = subjectss[sb - 1];
                    } while (sb < 1 || sb > 5);

                    Subject subject = new Subject(0, subjectName, totalLesson, subjectType);
                    dataController.writeSubjectToFile(subject, subjectFileName);
                    break;
                }
                case 2: {
                    subjects = dataController.readSubjectFromFile(subjectFileName);
                    System.out.println("******************Information Subject in file****************");
                    show(subjects);
                    break;
                }
                case 3: {
                    checkStudentID(dataController, studentFileName);
                    String fullName, address, phoneNumber;
                    System.out.println("Input fullName");
                    fullName = scanner.nextLine();
                    System.out.println("Input address");
                    address = scanner.nextLine();
                    do {
                        System.out.println("Input phoneNumber with format (xxx-xxx-xxxx)");
                        phoneNumber = scanner.nextLine();
                        String regex = "[0-9]{3}-[0-9]{3}-[0-9]{3}";
                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(phoneNumber);
                        if (matcher.find()) {
                            break;
                        } else {
                            System.out.println("please input with format true");
                        }
                    } while (true);
                    Student student = new Student(0, fullName, address, phoneNumber);
                    dataController.writeStudentToFile(student, studentFileName);
                    break;
                }
                case 4: {
                    students = dataController.readStudentFromFile(studentFileName);
                    System.out.println("******************Information Student in file****************");
                    show(students);
                    break;
                }
                case 5: {
                    // Student student, Subject subject, int numOfRegister, String date
                    int studentID, subjectID = 0, numOfRegister, totalOfRegister;
                    String date = null;
                    boolean checkRegister = false;
                    boolean checkSubject = false;
                    students = dataController.readStudentFromFile(studentFileName);
                    subjects = dataController.readSubjectFromFile(subjectFileName);
                    studentRegisters = dataController.readStudentRegisterFromFile(studentRegisterFileName);
                    do {
                        System.out.println("**********************Information Student**************************");
                        show(students);
                        System.out.println("Input StudentID");
                        studentID = scanner.nextInt();
                        if (studentID == 0) {
                            break;
                        }
                        checkRegister = checkRegisterSubject(studentRegisters, studentID);
                        if (checkRegister == false) {
                            System.out.println("don't allow register over 8 subject");
                        } else {
                            break;
                        }
                    } while (true);
                    do {
                        System.out.println("**********************Information Subject**************************");
                        show(subjects);
                        System.out.println("Input subjectID");
                        subjectID = scanner.nextInt();
                        if (subjectID == 0) {
                            break;
                        }
                        checkSubject = checkAllowRegisterSubject(studentID, subjectID, studentRegisters);
                        if (checkSubject == false) {
                            System.out.println("subject already exist");
                        } else {
                            break;
                        }
                    } while (true);
                    totalOfRegister = getTotal(studentRegisters, studentID);
                    do {
                        System.out.println("Input DateOfRegister With format dd/MM/yyyy");
                        scanner.nextLine();
                        date = scanner.nextLine();
                        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(date);
                        if (matcher.find()) {
                            break;
                        } else {
                            System.out.println("please input with format true");
                        }
                    } while (true);
                    do {
                        System.out.println("input numOfRegister: (registered " + totalOfRegister + ")");
                        numOfRegister = scanner.nextInt();
                        if (numOfRegister > 1) {
                            System.out.println("Only one subject can be selected at a time");
                        } else {
                            if ((totalOfRegister + numOfRegister >= 1) && (totalOfRegister + numOfRegister <= 8)) {
                                totalOfRegister += numOfRegister;
                                break;
                            } else {
                                System.out.println("you register over 8 subjects");
                            }
                        }
                    } while (true);

                    Student currentStudent = getStudent(students, studentID);
                    Subject currentSubject = getSubject(subjects, subjectID);
                    StudentRegister studentRegister = new StudentRegister(currentStudent, currentSubject, totalOfRegister, date);
                    studentRegisters = controllerUtilities.updateFile(studentRegisters, studentRegister);
                    dataController.updateFile(studentRegisters, studentRegisterFileName);
                    show(studentRegisters);
                    show(arrayList);
                    break;
                }
                case 6: {
                    int option;
                    do {
                        System.out.println("***********************Menu*********************");
                        System.out.println("1.Sort By NameStudent");
                        System.out.println("2.Sort By Date");
                        System.out.println("0.return main menu");
                        System.out.println("you choose!");
                        option = scanner.nextInt();
                        if (option == 0) {
                            break;
                        }
                        switch (option) {
                            case 1: {
                                studentRegisters = dataController.readStudentRegisterFromFile(studentRegisterFileName);
                                controllerUtilities.sortByName(studentRegisters);
                                System.out.println("***************Information Student After Sort***************");
                                show(studentRegisters);
                                break;
                            }
                            case 2: {
                                studentRegisters = dataController.readStudentRegisterFromFile(studentRegisterFileName);
                                controllerUtilities.sortByDate(studentRegisters);
                                System.out.println("***************Information Student After Sort***************");
                                show(studentRegisters);
                                break;
                            }
                        }
                    } while (option != 0);
                }
                case 7: {
                    studentRegisters = dataController.readStudentRegisterFromFile(studentRegisterFileName);
                    controllerUtilities.sortByDate(studentRegisters);
                    var result = controllerUtilities.createListRegister(studentRegisters);
                    if (result.size() == 0) {
                        System.out.println("nothing in List");
                    } else {
                        show(result);
                    }
                    break;
                    //controllerUtilities.dem(studentRegisters);
                }
            }


        } while (choose != 0);
    }

    private static boolean checkAllowRegisterSubject(int studentID, int subjectID, ArrayList<StudentRegister> studentRegisters) {
        for (var srm : studentRegisters) {
            if (srm.getSubject().getSubjectID() == subjectID && srm.getStudent().getStudentID() == studentID) {
                return false;
            }
        }
        return true;
    }

    private static int getTotal(ArrayList<StudentRegister> studentRegisters, int studentID) {
        for (var total : studentRegisters) {
            if (total.getStudent().getStudentID() == studentID) {
                return total.getNumOfRegister();
            }
        }
        return 0;
    }

    private static boolean checkRegisterSubject(ArrayList<StudentRegister> studentRegisters, int studentID) {
        for (var x : studentRegisters) {
            if (x.getStudent().getStudentID() == studentID && x.getNumOfRegister() >= 8) {
                return false;
            }
        }
        return true;
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

    private static void checkStudentID(DataController dataController, String studentFileName) {
        var students = dataController.readStudentFromFile(studentFileName);
        if (students.size() == 0) {

        } else {
            Student.setId(students.get(students.size() - 1).getStudentID() + 1);
        }
    }

    private static void checkSubjectID(DataController dataController, String subjectFileName) {
        var subjects = dataController.readSubjectFromFile(subjectFileName);
        if (subjects.size() == 0) {
            //don't thing
        } else {
            Subject.setId(subjects.get(subjects.size() - 1).getSubjectID() + 1);
        }
    }

    public static void show(ArrayList list) {
        for (var x : list) {
            System.out.println(x);
        }
    }
}
