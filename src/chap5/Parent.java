package chap5;


public class Parent {
    String parentName, address ,telephoneNo;

    public Parent(String parentName, String address, String telephoneNo) {
        this.parentName = parentName;
        this.address = address;
        this.telephoneNo = telephoneNo;
    }

    
    @Override
    public String toString() {
        return "Parent{" + "parentName=" + parentName + ", address=" + address + ", telephoneNo=" + telephoneNo + '}';
    }
    
}
