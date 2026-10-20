package chap6;

public interface Building {
    abstract void draftBlueprint();
    abstract void interior();
    abstract void construct(); // ไม่ต้องใส่ abtract ก็ได้
    
}//end

//การใช้งาน interface ต้องใช้ implements ต้อง overide method ทั้งหทด
class House implements Building{
    @Override
    public void draftBlueprint(){
        System.out.println("รูปแบบคฤหาส");
    }
    @Override
    public void interior(){
        System.out.println("สไตล์");
    }
    @Override
    public void construct(){
        System.out.println("construct");
    }
     
}//end