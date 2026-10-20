package chap3;
public class TestOuterB {
    public static void main(String[] args) {
        //none static เรียกผ่าน object
        
        //type 1
        OuterB  out = new OuterB();
        OuterB.MemberInner in1 = out.new MemberInner();
        
        //tpye 2
        OuterB.MemberInner in2 = new OuterB().new MemberInner();
        in2.inMeth1();
    }
}
