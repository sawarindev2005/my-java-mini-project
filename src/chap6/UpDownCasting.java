package chap6;

public class UpDownCasting {
    static void printBoat(Boat[] bt){
        for (int i = 0; i < bt.length; i++) {
            bt[i].showOwner();
            if(bt[i] instanceof Submarine){ //เช็ค 
                ((Submarine)bt[i]).move();//downcasting
            }
            
        }
    }//end
    
    public static void main(String[] args) {
        Boat bt[] = new Boat[2];
        bt[0] = new Boat();
        bt[1] = new Submarine();
        printBoat(bt);
    }//end
}//end
