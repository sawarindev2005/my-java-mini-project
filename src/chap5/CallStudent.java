package chap5;

public class CallStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId("674234015");
        s1.setStudentName("Sawarin");   
        s1.setCounsellor(new Counsellor("001", "Nalinee", "0889551234"));
        s1.setParent(new Parent("Manoiz", "Songkhla", "0862958791"));
        s1.printDetail();
    }
}
