package chap5;


public class Speaker {
    String name;

    public Speaker(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Speaker{" + "name=" + name + '}';
    }
    
}
