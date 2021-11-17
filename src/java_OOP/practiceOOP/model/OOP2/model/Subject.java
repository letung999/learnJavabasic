package java_OOP.practiceOOP.model.OOP2.model;

public class Subject {
    //Thông tin về Subject gồm các thuộc tính (subjectID, subjectName, totalLesson, subjectType)
    // – trong đó subjectType có thể là: General, specializations base, compulsory majors, specialization options,
    // subjectID là một số nguyên có 8 chữ số, tự động tăng.
    private static int id = 10000000;
    private int subjectID;
    private String subjectName;
    private int totalLesson;
    private String subjectType;

    public Subject(int subjectID) {
        this.subjectID = subjectID;
    }

    public Subject(int subjectID, String subjectName, int totalLesson, String subjectType) {
        if (subjectID == 0) {
            this.subjectID = id++;
        } else {
            this.subjectID = subjectID;
        }
        this.subjectName = subjectName;
        this.totalLesson = totalLesson;
        this.subjectType = subjectType;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Subject.id = id;//vì nó là thành phần static nên nó phải truy cập trực tiếp qua class;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getTotalLesson() {
        return totalLesson;
    }

    public void setTotalLesson(int totalLesson) {
        this.totalLesson = totalLesson;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID=" + subjectID +
                ", subjectName='" + subjectName + '\'' +
                ", totalLesson=" + totalLesson +
                ", subjectType='" + subjectType + '\'' +
                '}';
    }
}
