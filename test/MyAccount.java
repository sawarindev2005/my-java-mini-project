class BankAccount {
    private int accountNo;
    private String accountName;
    protected double balance; // ใช้ protected เพื่อให้คลาสลูกเข้าถึงได้ [cite: 14]

    public BankAccount(int accountNo, String accountName, double balance) {
        System.out.println("1. Constructor ของ BankAccount ทำงาน");
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount; 
        System.out.println("deposit ของแม่");
    } 
    
    public void printDetails() {
        System.out.println("Account No: " + accountNo + ", Balance: " + balance);
    }
}

class SavaingAccount extends BankAccount {
    // ต้องสร้าง Constructor และใช้ super เพื่อส่งค่าไปคลาสแม่ 
    public SavaingAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance); 
        System.out.println("2. Constructor ของ SavaingAccount ทำงาน");
    }
    
    @Override
    public void deposit(double amount) {
        System.out.println("deposit SavainAccount");
        System.out.println(amount); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

public class MyAccount {
    public static void main(String[] args) {
        // สร้างออบเจกต์เดียว แล้วเรียกใช้งาน
        SavaingAccount mySave = new SavaingAccount(101, "Somchai", 5000.0);
        mySave.printDetails();
        mySave.deposit(1500.0);
    }
}