package chap3.subpack;
public class Employee {
    public static int id = 1001;
    public String name = "Sawarin";
    public int age = 35;
    
    public static void work(){
        System.out.println("work()");
    }
    
    public void getSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args) {
        //call static
        System.out.println("ID : "+id);
        work();
        
        //call none static
        Employee em = new Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
        em.getSalary();
        
        
    }
}
