
public class FinalExam {

    public static void main(String[] args) {
        // กำหนดสตริงตัวอย่าง (ระวังเรื่องช่องว่างและการนับตำแหน่ง index)
        String text = "Java OOP Exam";
        
        // 1. length(): นับจำนวนตัวอักษรทั้งหมด (รวมช่องว่าง)
        int len = text.length();
        System.out.println("1. length: " + len); // ผลลัพธ์: 13 [cite: 4, 5]

        // 2. indexOf(): หาตำแหน่งแรกที่พบข้อความ (เริ่มนับ 0)
        int pos = text.indexOf("J");
        if(pos < 0){
            System.out.println("ไม่เจอค่า");
        }else{
            
        System.out.println("2. indexOf : " + pos); // ผลลัพธ์: 5 [cite: 4, 5]
        }

        // 3. charAt(): ดึงตัวอักษร ณ ตำแหน่งที่ระบุ
        char ch = text.charAt(9);
        System.out.println("3. charAt index : " + ch); // ผลลัพธ์: J [cite: 4, 5]

        // 4. substring(start, end): ตัดคำตั้งแต่ start ถึงก่อนตำแหน่ง end
        // ตัวอย่าง: ตำแหน่งที่ 5 คือ 'O', ตำแหน่งที่ 8 คือช่องว่าง (ตัดถึงแค่ 7)
        String sub = text.substring(0, 13);
        System.out.println("4. substring: " + sub); // ผลลัพธ์: OOP [cite: 4, 5]

        // 5. toUpperCase() และ toLowerCase()
        System.out.println("5.1 Upper: " + text.toUpperCase()); // ผลลัพธ์: JAVA OOP EXAM [cite: 5]
        System.out.println("5.2 Lower: " + text.toLowerCase()); // ผลลัพธ์: java oop exam [cite: 5]
    }
}
