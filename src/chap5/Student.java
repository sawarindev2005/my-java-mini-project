package chap5;


public class Student {
    private String studentId;
    private String studentName;
    private Counsellor counsellor;
    private Parent parent ;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
    public void printDetail(){
        System.out.println("StudentId"+getStudentId());
        System.out.println("Student Name"+getStudentName());
        System.out.println("Counsellor ID :"+getCounsellor().counsellorId);
        System.out.println("Counsellor Name :"+getCounsellor().counsellorName);
        System.out.println("Counsellor telephoneNo :"+getCounsellor().telephoneNo);
        System.out.println("Parent Name :"+getParent().parentName);
        System.out.println("Parent address : "+getParent().address);
        System.out.println("Parent telephoneNo :"+getParent().telephoneNo);
    }
}
