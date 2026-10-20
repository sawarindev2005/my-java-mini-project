package chap6;

public class CallPoly {
    static void printBoatOwner(Boat bt){//method Polymorphism
        bt.showOwner();
    }
    public static void main(String[] args) {
        Boat bt = new Boat();
        printBoatOwner(bt);
        
        Rowboat rw = new Rowboat();
        printBoatOwner(rw);
        
        Boat rb1 = new Rowboat();
        printBoatOwner(rb1);
        
        //Obj Submarine
        Boat sb = new Submarine();//ตัวแทนของแม่ แม่ไม่มี mthod move
        sb.showOwner();
        //down casting
        Submarine sb1 = (Submarine)sb;//down 1 
        sb1.move();
        
        //down casting แบบที่ 2
        ((Submarine)sb).move();
    }
}
