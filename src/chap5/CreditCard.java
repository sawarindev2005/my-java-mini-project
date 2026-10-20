package chap5;

public class CreditCard {
    private double minimumSalary;

    private CreditCard(double minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public double getMinimumSalary() {
        return minimumSalary;
    }
    public static CreditCard create(double minimumSalary){
        if(minimumSalary > 15000){
            return new CreditCard(minimumSalary);
        }else{
            return null;
        }
    }
    
    public void setMinimumSalary(double minimumSalary) {
        this.minimumSalary = minimumSalary;
    }
    
    
    
}
