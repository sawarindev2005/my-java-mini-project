package chap1;


public class Student {

    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;

    public void enrollment(String studentId) {
        System.out.println("Enrollment : " + studentId);
    }

    public void payment(String studentId) {
        System.out.println("เหมาจ่าย Payment : " + studentId);
    }

    public void addCourse(String studentId) {
        System.out.println("AddCourse : " + studentId);
    }

    public void dropCourse(String studentId) {
        System.out.println("DropCourse : " + studentId);
    }

    void printAttribute() {
        System.out.println("studentId : " + studentId);
        System.out.println("studentName : " + studentName);
        System.out.println("faculty : " + faculty);
        System.out.println("major : " + major);
    }

//    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.studentId = "674234015";
//        student1.studentName = "Sawarin";
//        student1.faculty = "Tecnology";
//        student1.major = "ComputerSci";
//        student1.printAttribute();
//        student1.enrollment("Programming 1");
//        student1.payment("cash");
//        student1.addCourse("Programming 2");
//        student1.dropCourse("Numerical");
//
//    }
}
