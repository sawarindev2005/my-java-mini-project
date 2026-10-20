package chap8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*; // all

public class MouseGUIMemberAdapter extends JFrame{
    JLabel lblHello;
    public MouseGUIMemberAdapter() {
        JPanel panel = new JPanel();
        Font fnt = new Font("Tahoma", Font.PLAIN, 40);
        lblHello = new JLabel("Hellow Everyone");
        lblHello.setFont(fnt);
        panel.add(lblHello);
        this.add(panel, BorderLayout.CENTER);
        lblHello.addMouseListener(new Say()); // 
    }

    //inner Class
    // member Class
    //เปลี่ยนเป็น extends แทน
    class Say extends MouseAdapter{

        //ใช้ 2 method ตรงนี้
        @Override
        public void mouseEntered(MouseEvent e) {
            lblHello.setText("Hello Member Class MouseAdapter");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            lblHello.setText("Member MouseAdapter good bye....");
        }

    }

    public static void main(String[] args) {
        JFrame frm = new MouseGUIMemberAdapter();
        frm.setTitle("Creted by Sawarin");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400, 400);
        frm.setVisible(true);
    }
}//end 
