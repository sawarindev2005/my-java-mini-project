package chap5;

public class CallComputer {
    public static void main(String[] args) {
        Computer cpt = new Computer();
        cpt.setCasee(new Case("ATX"));
        cpt.setMoniter(new Monitor("21 inch"));
        cpt.setKeyboard(new Keyboard("Wiress"));
        cpt.setMouse(new Mouse("Wiress"));
        cpt.setSpeaker(new Speaker("Razer"));
        System.out.println(cpt.getCasee());
        System.out.println(cpt.getMoniter());
        System.out.println(cpt.getKeyboard());
        System.out.println(cpt.getMouse());
        System.out.println(cpt.getSpeaker());
        
    }
}
