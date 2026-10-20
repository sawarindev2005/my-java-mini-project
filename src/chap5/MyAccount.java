package chap5;
public class MyAccount {
    public static void main(String[] args) {
        FixedDepositAccount ba = FixedDepositAccount.createFD(102, "Sawarin ", 100);
        if(ba != null){
            ba.printDetails();
            ba.deposit(500);
            ba.printDetails();
            ba.deposit(499);
            ba.printDetails();
            ba.withdraw(9000);
            ba.printDetails();
            
        }else{
            System.out.println("ไม่สามารถเปิดบัญชีได้ FixedDepositAccount");
        }     
        System.out.println("======================");
        System.out.println("SavingAccount");
        SavingAccount ba1 = SavingAccount.createSA(101,"Sawarin", 10);
        if(ba1 != null){
            ba1.printDetails();
            ba1.deposit(500);
            ba1.printDetails();
            ba1.withdraw(1460);
            ba1.printDetails();
        }else{
            System.out.println("เปิดบัญชีไม่ได้ SavingAccount");
        }
        

        

    }
}
