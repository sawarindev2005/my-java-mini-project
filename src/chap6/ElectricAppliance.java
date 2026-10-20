package chap6;

abstract public class ElectricAppliance {
    abstract void on();
    abstract void off();
    abstract void work();
}//end

abstract class Fan1 extends ElectricAppliance{

    @Override
    public void off(){
        System.out.println("off");
    };

    @Override
    public void on(){
        System.out.println("on");
    };
    
}//end

class Fan2 extends Fan1{
    @Override
    public void work(){
        System.out.println("work");
    };
}
