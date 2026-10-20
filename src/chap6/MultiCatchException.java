package chap6;

public class MultiCatchException {
    public static void main(String[] args) {
        String str [] = {"A","B","C"};
        try {
            int zero = 10;
            int result = 100 / zero;
            System.out.println("result : "+result);
            System.out.println("str[3] : "+str[3]);
        }catch (ArithmeticException e) {
            System.out.println("หารด้วย 0 ไม่ได้ : " + e.getMessage());
        }catch(Exception e1){
            System.out.println("err : "+e1.getMessage());
            System.out.println("index ที่ระบุ ไม่มี");
        }finally{
            System.exit(0);//หยุดไม่ทำใน finally
            System.out.println("ทำทุกครั้ง เกิด/ไม่เกิด Exeption");
        }
    }
}
