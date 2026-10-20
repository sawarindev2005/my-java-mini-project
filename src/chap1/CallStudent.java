package chap1;

public class CallStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        
        student1.studentId = "674234015";
        student1.studentName = "Sawarin";
        student1.faculty = "Tecnology";
        student1.major = "ComputerSci";
        student1.printAttribute();
        student1.enrollment("Programming 1");
        student1.payment("cash");
        student1.addCourse("Programming 2");
        student1.dropCourse("Numerical");
    }
        
}
