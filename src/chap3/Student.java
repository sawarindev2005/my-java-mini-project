package chap3;


public class Student {

    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;
  
    //Default Constructor
    public Student() {
        System.out.println("Default Constructor");
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, String faculty) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = faculty;
    }

    public Student(String studentId, String studentName, String faculty, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.faculty = faculty;
        this.major = major;
    }

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
        System.out.println("=======================");
        System.out.println("studentId : " + studentId);
        System.out.println("studentName : " + studentName);
        System.out.println("faculty : " + faculty);
        System.out.println("major : " + major);
        System.out.println("=======================");

    }

    public static void main(String[] args) {
        //class                Constructor
        Student student1 = new Student();
        student1.printAttribute();
        
        Student student2 = new Student("015");
        student2.printAttribute();
        
        Student student3 = new Student("015","Manoiz");
        student3.printAttribute();
        
        Student student4 = new Student("015","Manoiz","SCI-TEC");
        student4.printAttribute();
        
        Student student5 = new Student("015","Manoiz","SCI-TEC","Com-Sci");
        student5.printAttribute();
//        student1.studentId = "674234015";
//        student1.studentName = "Sawarin";
//        student1.faculty = "Tecnology";
//        student1.major = "ComputerSci";
//        student1.printAttribute();
//        student1.enrollment("Programming 1");
//        student1.payment("cash");
//        student1.addCourse("Programming 2");
//        student1.dropCourse("Numerical");

    }
}
