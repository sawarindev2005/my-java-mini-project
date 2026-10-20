package chap6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowException {

    static void divideNumber(int intArr[]) throws ArithmeticException, NullPointerException {
        int result = 0;
        if (intArr == null) {
            throw new NullPointerException("object in null");
        } else {
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i] == 0) {
                    throw new ArithmeticException("หารด้วย 0 ไม่ได้");
                } else {
                    result = 1500 / intArr[i];
                }
                System.out.println("result = " + intArr[i]);
            }
        }
    }//end method
    
    static void readInput() throws FileNotFoundException{
        FileReader read = new FileReader("D:\\learn_java\\chap4\\EmployeeInfo");
    }//end

    public static void main(String[] args) {

        int intArr[] = {0, 5, 10, 0};
        try {
            divideNumber(intArr);
        } catch (Exception e) {
            System.out.println("ERR = "+e.getMessage());
        }
        try {
            readInput();
        } catch (Exception e) {
            System.out.println("หาไฟล์ไม่เจอ");
        }
    }
}
