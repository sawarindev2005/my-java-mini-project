package chap3;

public class PassByReference {
    
    static void changeGirlRef(Girl girl){
        girl.phoneNo = "099-999-8888";
    }
    public static void main(String[] args) {
        Girl gl = new Girl("Sawarin","088-888-9999");
        System.out.println("BF object = "+gl);
        gl.print();
        changeGirlRef(gl);
        gl.print();
        System.out.println("AF object = "+gl);
    }
}
