package java_OOP.practiceOOP.model.OOP2.model;

public class Student {
    //Thông tin về Student (studentID, fullName, address, phoneNumber),
    // studentID là một số nguyên có 6 chữ số, tự động tăng,
    // điện thoại có định dạng xxx-xxx-xxxx (ví dụ: 345-234-1237
    private static int id = 100000;
    private int studentID;
    private String fullName;
    private String address;
    private String phoneNumber;

    public Student(int studentID) {
        this.studentID = studentID;
    }

    public Student(int studentID,String fullName, String address, String phoneNumber){
        if(studentID == 0){
            this.studentID = id++;
        }
        else {
            this.studentID = studentID;
        }
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public int getStudentID(){
        return this.studentID;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
