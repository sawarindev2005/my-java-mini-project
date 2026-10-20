package chap8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*; // all

public class MouseGUI extends  JFrame implements MouseListener{
    JLabel lblHello;
    
    public MouseGUI() {
        JPanel panel = new JPanel();
        Font fnt = new Font("Tahoma", Font.PLAIN, 40);
        lblHello = new JLabel("Hellow Everyone");
        lblHello.setFont(fnt);
        panel.add(lblHello);
        this.add(panel,BorderLayout.CENTER);
        lblHello.addMouseListener(this); // 
    }
    //insert code implement method
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e){}
    
    //ใช้ 2 method ตรงนี้
    @Override
    public void mouseEntered(MouseEvent e){
        lblHello.setText("Hello How are you");
    }

    @Override
    public void mouseExited(MouseEvent e){
        lblHello.setText("good bye....");
    }

    
    public static void main(String[] args) {
        JFrame frm = new MouseGUI();
        frm.setTitle("Creted by Sawarin");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400, 400);
        frm.setVisible(true);
    }
}//end 
