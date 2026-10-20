package chap5;
// constucter ไม่สามารถ return ...typeได้
public class SavingAccount extends BankAccount {
    //ต้องมี constucter เหมือนแม่
    // constucter private 
    private SavingAccount(int accountNo, String accountName, double balance) {
        //System.out.println("");//error
        //ต้องมี super ถ้าแม่ไม่เกิด ทำไรไม่ได้เลย
        super(accountNo, accountName, balance);//เรียกของแม่
        
    }
    //return object
    public static SavingAccount createSA(int accountNo, String accountName, double balance){
        if (balance >= 100) {
            return new SavingAccount(accountNo, accountName, balance);
        } else {
            return null;
        }
    }
    
    @Override
    public void withdraw(double amount) {
        System.out.println("ถอน < "+amount);
        
        double balance= getBalance() - amount;
        
        if(balance < 50) {
            System.out.println("ยอดเงินคงเหลือ < 50");
        }else{
            setBalance(balance);
        }
    }
    
}//end

