package chap1;


public class GraduateStudent extends Student{
    
    private String studeyLevel;
    private String thesisAdviser;
    
    @Override // polimiphism
    public void payment(String studentId) {
        System.out.println("จ่ายตามหนวยกิต Payment : " + studentId);
    }

    public void oralExamination(String studentId) {
        System.out.println(studentId + "Success");
    }

    public void thesisExamination(String studentId) {
        System.out.println(studentId + "Success");
    }
    void printGraduateStudent(){
        System.out.println(studeyLevel);
        System.out.println(thesisAdviser);
    }
    public static void main(String[] args) {
        GraduateStudent ma = new GraduateStudent();
        
        ma.studeyLevel = "ป.ตรี";
        ma.thesisAdviser = "อาจารย์ มะน้อย";
        ma.oralExamination("674234015");
        ma.thesisExamination("674234015");
        ma.printGraduateStudent();
        ma.studentId = "674234015";
        ma.studentName = "674234015";
        ma.faculty = "674234015";
        ma.major = "674234015";
        ma.printAttribute();
        ma.enrollment("Programming 1");
        ma.payment("674234015");
        ma.addCourse("Programming 2");
        ma.dropCourse("Numerical");
    }
}
