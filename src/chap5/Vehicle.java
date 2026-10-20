package chap5;
public class Vehicle {
    protected String color;
    protected String brand;
    protected String size;
    
    protected void start(){
        System.out.println("start");
    }
    
    protected void stop(){
        System.out.println("stop");
    }
    protected void pause(){
        System.out.println("pause");
    }
    
    protected void move(){
        System.out.println("move 100Km/h");
    }
}//end

class Car extends Vehicle{
    String series;
    String size; //Shadow Athibute
    
    void changeGear(){
        System.out.println("changeGear");
    }

    @Override // เขียนทับแม่
    protected void move() { //super อ้างถึง move()ของแม่
        System.out.println("move 120Km/h");
    }
 
}//end car

class Boat extends Vehicle{
    
}//end
class Plane extends Vehicle{
    
}//end

class Truck extends Car{
    
}//end
class Bus extends Car{
    
}
