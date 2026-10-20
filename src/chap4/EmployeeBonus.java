package chap4;

import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeBonus {
    
    static void printMenu(){
        System.out.println("------Menu------");
        System.out.println("0 : Exit");
        System.out.println("1 : Employee Information Entry");
        System.out.println("2 : Employee Summary");
        System.out.println("----------------");
    }
    
    static double computeBonus(int saleClass, double salary) {
    double bonusRate = 0;

    // ตรวจสอบเงื่อนไขตำแหน่ง (saleClass ในที่นี้คือ position)
    if (saleClass == 1) {
         bonusRate = (salary < 10000) ? 0.05 : 0.10; 
    } else if (saleClass == 2) {
        bonusRate = (salary < 10000) ? 0.15 : 0.20; 
    } else if (saleClass == 3) {
        bonusRate = (salary < 10000) ? 0.25 : 0.30;
    } else {
        bonusRate = 0.05; 
    }

    return salary * bonusRate;
}
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chek = 0;
        String type;
        double totalSalary = 0 ,totalbonus = 0,bonus;
        
        ArrayList<EmployeeInfo> empArray = new ArrayList<EmployeeInfo>();

        do {
            printMenu();
            System.out.print("Please Enter Menu [0-2]: ");
            chek = sc.nextInt();
            if(chek == 1){
                EmployeeInfo emp = new EmployeeInfo();
                
                System.out.println("ป้อนข้อมูล");
                System.out.print("Enter ID : ");
                String id = sc.next(); 
                
                System.out.print("Enter Name : ");
                String name = sc.next(); 
                
                System.out.print("Enter surname : ");
                String surname = sc.next(); 
                
                System.out.print("Enter position : ");
                int position = sc.nextInt();
                
                
                System.out.print("Enter salary : ");
                double salary = sc.nextDouble();
               
                emp.setId(id);
                emp.setName(name);
                emp.setSurname(surname);
                emp.setPosition(position);
                emp.setSalary(salary);
                //เก็บ emp เข้า arr
                empArray.add(emp);
            }else if(chek == 2){// พิมพ์สรุป
                System.out.println("สรุปผล");
                //fore ob loop หมด arr
                for (EmployeeInfo empInfo : empArray) {
                    System.out.print("ID = "+empInfo.getId());
                    System.out.print(" Name = "+empInfo.getName());
                    System.out.print(" SurName = "+empInfo.getSurname());
                    System.out.print(" Position = "+empInfo.getPosition());
                    System.out.print(" Salary = "+empInfo.getSalary());
                    double salary = empInfo.getSalary();
                    bonus = computeBonus(empInfo.getPosition(), empInfo.getSalary());
                    System.out.print(" bonus = "+bonus);
                    totalSalary = totalSalary +salary;
                    totalbonus = totalbonus + bonus;
                    System.out.println("");
                }
                System.out.println("Summary");
                System.out.println("จำนวนคนทั้งหมด = "+empArray.size());
                System.out.println("เงินเดือนรวมทั้งหมด = "+totalSalary);
                System.out.println("โบนัสรวมทั้งหมด = "+totalbonus);
                
            }else if(chek > 2){
                System.out.println("กรุณากรอกให้ถูกต้อง");
            }
        } while (chek > 0 && chek < 3 );
                
        
    }
}
