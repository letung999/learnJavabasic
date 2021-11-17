package java_OOP.practiceOOP.model.OOP2.model;

public class StudentRegister {
    //Thêm lớp StudentRegister trong đó một Student sẽ được phép đăng ký không quá 8 Subject một học kỳ.
    // Ghi rõ thời gian đăng ký của Student.
    private Student student;
    private Subject subject;
    private int numOfRegister;
    private String date;

    public StudentRegister(Student student){
        this.student = student;
    }

    public StudentRegister(Subject subject){
        this.subject = subject;
    }

    public StudentRegister(Student student, Subject subject, int numOfRegister, String date){
        this.student = student;
        this.subject = subject;
        this.numOfRegister = numOfRegister;
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getNumOfRegister() {
        return numOfRegister;
    }

    public void setNumOfRegister(int numOfRegister) {
        this.numOfRegister = numOfRegister;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "StudentRegister{" +
                "studentID=" + student.getStudentID() +
                ", studentName=" + student.getFullName() +
                ", subjectID=" + subject.getSubjectID() +
                ", subject=" + subject.getSubjectName() +
                ", numOfRegister=" + numOfRegister +
                ", date='" + date + '\'' +
                '}';
    }
}
