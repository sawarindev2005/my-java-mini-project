package chap1;


public class Car {

    String color;
    double price;
    int wheel;
    int door;
    double speed;
    int engine;

    void turnLeft() {
        System.out.println("turnLeft");
    }

    void turnRight() {
        System.out.println("turnRight");
    }

    void doBreak() {
        System.out.println("doBreak");
    }

    void move(int speed) {
        System.out.println("move");
    }
    void printAttribute(){
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
        System.out.println("Wheel : "+wheel);
        System.out.println("Door : "+door);
        System.out.println("Speed : "+speed);
        System.out.println("Engine : "+engine);
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "gold";
        myCar.price = 1500000.50;
        myCar.wheel = 4;
        myCar.door = 2;
        myCar.speed = 200;
        myCar.engine = 2000;
        myCar.printAttribute();
        myCar.move(120);
        myCar.turnLeft();
        myCar.turnRight();
        myCar.doBreak();
        
    }
}//end
