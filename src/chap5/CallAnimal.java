package chap5;
public class CallAnimal {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Manoiz";
        //System.out.println("Name :"+cat.name);
        cat.grow();
        cat.reproduce();
        cat.setColor("Blue");
        //System.out.println("Color : "+cat.getColor());
        cat.leg = 4;
        //System.out.println("Leg : "+cat.leg);
        cat.move();
        cat.getColor();
        cat.printAnimal();
    }
}
