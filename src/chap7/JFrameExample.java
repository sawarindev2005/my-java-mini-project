package chap7;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Created by Sawarin");
        frm.setSize(500, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);//show
         
    }
}//end
