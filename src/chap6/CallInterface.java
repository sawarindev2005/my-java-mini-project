package chap6;

public class CallInterface {
    public static void main(String[] args) {
        new Building() { // anonymous class
            @Override
            public void draftBlueprint() {
                System.out.println("");
            }

            @Override
            public void interior() {
                System.out.println("");
            }

            @Override
            public void construct() {
                System.out.println("");
            }
        };
        House house = new House();
        house.draftBlueprint();
        house.interior();
        house.construct();
    }
}
