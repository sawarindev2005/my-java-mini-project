package chap6;

public class CallPolymorphism {
    public static void main(String[] args) {
       // Object ธรรมดา
       Boat bo = new Boat();
       // Object Polymorphism
       Boat poly1 = new Rowboat();
       Boat poly2 = new Submarine();
       // Object Polymorphism Array
       Boat polyArr[] = new Boat[3];
       polyArr[0] = new Boat();
       polyArr[1] = new Rowboat();
       polyArr[2] = new Submarine();
       
       //static & Dynamic binding
       Boat poly3 = new Rowboat();
       System.out.println("owner "+poly3.owner);//static biding แม่
       poly3.showOwner();//Dynamic method
       
    }
}
