package chap4;

import java.util.Scanner;

public class ScannerExample {

    public static String checkAge(int age) {
        String ageGroup;
        if (age < 15) {
            ageGroup = "วัยเด็ก";
        } else if (age > 15 && age < 26) {
            ageGroup = "วัยรุ่น";
        } else if (age > 26 && age < 50) {
            ageGroup = "วัยทำงาน";
        } else {
            ageGroup = "วัยเกษียณ";
        }
        return ageGroup;
    }

    public static String checkSalary(double salary) {
        String salaryGroup;
        if (salary < 10000) {
            salaryGroup = "Technicial ";
        } else if (salary >= 10000 && salary <= 30000) {
            salaryGroup = "Programmer";
        } else if (salary >= 30001 && salary <= 50000) {
            salaryGroup = "System Analyst";
        } else {
            salaryGroup = "Project Manager";
        }
        return salaryGroup;
    }

    public static String checkDate(int day) {
        String output = "";
        switch (day) {
            case 1:
                output = "Mondey";
                break;
            case 2:
                output = "Tuesday";
                break;
            case 3:
                output = "Wenesday";
                break;
            case 4:
                output = "Thursday";
                break;
            case 5:
                output = "Friday";
                break;
            case 6:
                output = "Saturday";
                break;
            case 7:
                output = "Sunday";
                break;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.next();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.print("Salaly : ");
        double salary = sc.nextDouble();

        System.out.print("Enter day : ");
        int day = sc.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("Salaly = " + salary);
        System.out.println("day = " + salary);
        System.out.println("อายุ : "+ age + " กลุ่มช่วงอายุ: " + checkAge(age));
        System.out.println("เงินเดือน : " + salary +  " ตำแหน่ง: " + checkSalary(salary));
        System.out.println("วันที่เกิด: " + checkDate(day));

//        ScannerExample obj = new ScannerExample();
//        String ageGroup = obj.checkAge(age);
//        String salaryGroup = obj.checkSalary(salary);
//
//        System.out.println("กลุ่มช่วงอายุ: " + ageGroup);
//        System.out.println("ตำแหน่ง: " + salaryGroup);
    }
}
