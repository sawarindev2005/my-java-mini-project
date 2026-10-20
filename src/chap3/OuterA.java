package chap3;

public class OuterA {
    int outAtt1 = 5;
    static int outAtt2 = 10;

    void outMeth1() {
        System.out.println("outMeth1");
    }

    static void outMeth2() {
        System.out.println("outMeth2");
    }

    static class StaticInner {
        int inAtt1 = 5;
        static int inAtt2 = 10;

        void inMeth1() {
            System.out.println("inMeth1");
        }

        static void inMeth2() {
            System.out.println("inMeth2");
        }
    }//end StaticInner
    
}//end OuterA
