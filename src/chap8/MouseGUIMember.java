package chap8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*; // all

public class MouseGUIMember extends JFrame{
    JLabel lblHello;
    public MouseGUIMember() {
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
    class Say implements MouseListener {

        //insert code implement method
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        //ใช้ 2 method ตรงนี้
        @Override
        public void mouseEntered(MouseEvent e) {
            lblHello.setText("Hello Member Class");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            lblHello.setText("Member good bye....");
        }

    }

    public static void main(String[] args) {
        JFrame frm = new MouseGUIMember();
        frm.setTitle("Creted by Sawarin");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400, 400);
        frm.setVisible(true);
    }
}//end 
