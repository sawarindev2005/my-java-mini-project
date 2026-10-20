package chap7;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogExample {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Created by Sawarin");
        frm.setSize(500, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);//show
         
        JDialog dlg = new JDialog(frm, "my dialog");
        dlg.setSize(200, 100);
        dlg.setVisible(true);//show
    }
}//end
