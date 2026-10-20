package chap6;

public class MyException {

    public static void main(String[] args) {
        TicTacToe tic;
        //NullPointerException
        try {
            tic = null;
            tic.start();
            System.out.println("after");
        } catch (NullPointerException e) {
            System.out.println("err = " + e.getMessage());
            System.out.println("Object : null >> " + e);
        }
        //ArithmeticException
        try {
            int zero = 0;
            int result = 100 / zero;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("หารด้วย 0 ไม่ได้ : " + e.getMessage());
        }

        //ArrayIndexOutOfBoundsException อ้างถึง index ผิด
        try {
            TicTacToe ticArr[] = new TicTacToe[3];
            ticArr[0] = new TicTacToe();
            ticArr[1] = new TicTacToe();
            ticArr[2] = new TicTacToe();
            ticArr[3] = new TicTacToe();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index ตัวที่ [3] ไม่มี");
        }
        //NumberFormatException
        try {
            String numStr = "o1234";
            System.out.println("แปลงเป็นตัวเลข = " + Integer.parseInt(numStr));
        } catch (NumberFormatException e) {
            System.out.println("แปลงตัวอักขระเป็นเลขไม่ได้ : " + e);
        }
        
        
    }//end main
}//end
