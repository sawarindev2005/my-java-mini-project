package chap3;

//import chap1.Student;
//import chap1.GraduateStudent;
//import chap1.Car;

//import chap3.subpack.Employee;
import chap1.*;


public class CallEmployee {
    public static void main(String[] args) {
        //call static
        
        System.out.println("ID : "+chap3.subpack.Employee.id);
        chap3.subpack.Employee.work();
        
        //call none static
        chap3.subpack.Employee em = new chap3.subpack.Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
        em.getSalary();
    }
    //1.ใช้ชื่อเต็ม
//    chap1.Student s1 = new chap1.Student();
//    chap1.GraduateStudent s2 = new chap1.GraduateStudent();
//    chap1.Car s3 = new chap1.Car();
    
    //2.ใช้คำสั่ง import
    Student s1 = new Student();
    GraduateStudent s2 = new GraduateStudent();
    Car s3 = new Car();
}
