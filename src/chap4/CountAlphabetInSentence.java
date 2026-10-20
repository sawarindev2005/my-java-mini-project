package chap4;

import java.util.Scanner;

public class CountAlphabetInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Sentence : ");
        String input = sc.next().toUpperCase();
        System.out.println("input"+input);
        System.out.println("ความยาว input = "+input.length());
        System.out.println("ตัวแรก : "+input.charAt(0));
        System.out.println("พิมพ์ใหญ่ input : " +input.toUpperCase());
        System.out.println("พิมพ์เล็ก input : "+input.toLowerCase());
        int sara = 0;
        int notSara = 0;
        for (int i = 0; i < input.length(); i++) {
            
            char ch = input.charAt(i);
            System.out.println("ch : "+ch);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'){
                sara ++;
            }else{
                notSara++;
            }
        }
        System.out.println("จำนวนสระ = "+sara);
        System.out.println("จำนวนไม่ใช่สระ "+ notSara);
    }
}
