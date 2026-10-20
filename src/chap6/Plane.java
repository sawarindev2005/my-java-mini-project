package chap6;

abstract public class Plane {//ต้องเป็น abstract ไม่สามารถ new ได้
    void takeoff(){
        System.out.println("takeoff");
    }
    void landing(){
        System.out.println("landing");
    }
    abstract void fly();//
}//end

class Boeing extends Plane{
    @Override
    void fly(){
        System.out.println("Boeing fly");
    }
}
