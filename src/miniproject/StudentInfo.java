package miniproject;



public class StudentInfo {
    private int id;             // id ใน DB (ไม่ต้องแสดง)
    private String studentId;   // student_id ที่ผู้ใช้กรอก
    private String studentName;
    private String studentSurname;
    private double midterm;
    private double finalScore;
    private double total;
    private String grade;

    // เพิ่ม Getter/Setter ของ field ใหม่
    public double getMidterm() { return midterm; }
    public void setMidterm(double midterm) { this.midterm = midterm; }

    public double getFinalScore() { return finalScore; }
    public void setFinalScore(double finalScore) { this.finalScore = finalScore; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    // ... getter/setter เดิม

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

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }
    
    
}



//ส่วนที่ 1 : โหลดตาราง     → loadTable()
//ส่วนที่ 2 : คำนวณเกรด     → calculateGrade()
//ส่วนที่ 3 : ปุ่ม Add/Delete → btnAddActionPerformed / btnDeleteActionPerformed
//ส่วนที่ 4 : สรุปเกรด       → btnSummaryActionPerformed
