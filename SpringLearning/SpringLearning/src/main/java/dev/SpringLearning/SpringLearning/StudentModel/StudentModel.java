package dev.SpringLearning.SpringLearning.StudentModel;

public class StudentModel {
    private int studentId;
    private String studentName;
    private String studentDept;
    private int studentGrade;
    private String collegeName;

    public StudentModel(int studentId, String studentName, String studentDept, int studentGrade, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDept = studentDept;
        this.studentGrade = studentGrade;
        this.collegeName = collegeName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
