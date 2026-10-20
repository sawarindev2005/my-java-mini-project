package chap6;
// 1 java file มี public class ได้ 1 เดียว
public class Boat {
    String owner = "แม่ someone";
    
    void showOwner(){
        System.out.println("Boat : owner  = "+ owner);
    }
}//end Boat

class Rowboat extends Boat{
    String owner = "ลูก : Joey";//Shadow
    @Override
    void showOwner(){
        System.out.println("ลูก Rowboat : owner = "+owner);
    }
}//end Rowboat

class Submarine extends Boat{
    String owner = "ลูก : Peter";
    void move(){
        System.out.println("ลูก move()");
    }
}//end Submarine

