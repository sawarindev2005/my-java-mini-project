package chap5;
public class LivingThing {
    protected String name;
    
    public void grow(){
        System.out.println("grow");
    }
    public void reproduce(){
        System.out.println("reproduce");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

class Animal extends LivingThing{
    private String color;
    protected int leg;
    
    public void move(){
        System.out.println("move");
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
    public void printAnimal(){
        System.out.println("Name :"+name);
        System.out.println("Color :"+getColor());
        System.out.println("Leg : "+leg);
}

}
class Plant extends LivingThing{
    

}
