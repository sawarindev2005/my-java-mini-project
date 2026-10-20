package chap8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*; // all

public class MouseGUIAnonymousAdapter extends JFrame {

    JLabel lblHello;

    public MouseGUIAnonymousAdapter() {
        JPanel panel = new JPanel();
        Font fnt = new Font("Tahoma", Font.PLAIN, 40);
        lblHello = new JLabel("Hellow Everyone");
        lblHello.setFont(fnt);
        panel.add(lblHello);
        this.add(panel, BorderLayout.CENTER);
        
        lblHello.addMouseListener(new MouseAdapter(){//Anonymous
            
            //ใช้ 2 method ตรงนี้
            @Override
            public void mouseEntered(MouseEvent e) {
                lblHello.setText("Anonymous MouseAdapter : Hello");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblHello.setText("Anonymous MouseAdapter : good bye....");
            }

        }
        ); // 
    }

    public static void main(String[] args) {
        JFrame frm = new MouseGUIAnonymousAdapter();
        frm.setTitle("Creted by Sawarin");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400, 400);
        frm.setVisible(true);
    }
}//end 
