package chap3;

public class OuterB {

    int outAtt1 = 5;
    int outAtt2 = 10;

    void outMeth1() {
        System.out.println("outMeth1");
    }

    void outMeth2() {
        System.out.println("outMeth2");
    }

    class MemberInner {

        int inAtt1 = 5;
        int inAtt2 = 10;

        void inMeth1() {
            System.out.println("inMeth1");
        }

    }//end StaticInner

}//end OuterA
