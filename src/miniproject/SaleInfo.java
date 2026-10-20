package miniproject;

public class SaleInfo {
    private String saleId;
    private String name;
    private String surname;
    private String saleClass;
    private double saleTotal;
    private double rate;

    public String getSaleId() { return saleId; }
    public void setSaleId(String saleId) { this.saleId = saleId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getSaleClass() { return saleClass; }
    public void setSaleClass(String saleClass) { this.saleClass = saleClass; }

    public double getSaleTotal() { return saleTotal; }
    public void setSaleTotal(double saleTotal) { this.saleTotal = saleTotal; }

    public double getRate() { return rate; }
    public void setRate(double rate) { this.rate = rate; }
}//end