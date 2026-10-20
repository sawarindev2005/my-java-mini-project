package chap5;
public class CallVehicle {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.brand = "Honda";
        honda.color = "Pink" ;
        honda.start();
        honda.stop();
        honda.pause();
        honda.move();
        
        Truck truck1 = new Truck();
        truck1.brand = "รถบรรทุก";
        truck1.color = "red" ;
        truck1.start();
        truck1.stop();
        truck1.pause();
        truck1.move();
        
        Bus b1 = new Bus();
        b1.brand = "benz";
        b1.color = "Pink" ;
        b1.start();
        b1.stop();
        b1.pause();
        b1.move();
    }
}
