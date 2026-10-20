package chap5;

public class CallCreditCard {
    
    public static void main(String[] args) {
        CreditCard c1 = CreditCard.create(25000);
        System.out.println("c1 = "+c1);
        CreditCard c2 = CreditCard.create(250);
        System.out.println("c2 = "+c2);
    }   
}
