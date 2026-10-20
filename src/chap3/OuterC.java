package chap3;

public class OuterC {

    int outAtt1 = 5;
    static int outAtt2 = 10;

    void outMeth1(int x, boolean y) {
        System.out.println("outMeth1");
        class LocalInner{
            void showDetail(){
                System.out.println("Show detail");
            }
        }//end LocalInner
        
        if (y) {
            new LocalInner().showDetail();
        }
    }//end outMeth1
    
    void outMeth2(int x, boolean y) {
        System.out.println("outMeth1");
        class LocalInner2{
            
        }//end LocalInner
    }//end outMeth2

}//end OuterA
