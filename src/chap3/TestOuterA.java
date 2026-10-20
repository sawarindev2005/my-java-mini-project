package chap3;
public class TestOuterA {
    public static void main(String[] args) {
        OuterA test1 = new OuterA();
        //none static เรียกผ่าน opject
        test1.outMeth1();
        //static เรียกผ่าน class
        OuterA.outMeth2();
        
        OuterA.StaticInner in = new OuterA.StaticInner();
        in.inMeth1();
        OuterA.StaticInner.inMeth2();
        
    }
}
