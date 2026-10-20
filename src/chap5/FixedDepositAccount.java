package chap5;

public class FixedDepositAccount extends BankAccount{

    private FixedDepositAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);    
    }
    
    public static FixedDepositAccount createFD(int accountNo, String accountName, double balance){
        if (balance >= 1000) {
            return new FixedDepositAccount(accountNo, accountName, balance);
        } else {
            return null;
        }
    }

    @Override
    public void deposit(double amount) {
        double balance = getBalance();
        if(amount >= 500){
            System.out.println("ฝากสำเร็จ"+amount);
            balance = balance+ amount;
            setBalance(balance);
        }else{
            System.out.println("กรุณาฝากให้มากกว่า 500");
            setBalance(balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        balance-=amount;
        System.out.println("ถอน < "+amount);
        setBalance(balance);
        
    }
    
    
}
