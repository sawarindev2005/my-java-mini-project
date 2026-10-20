package chap7;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Created by Sawarin");
        frm.setSize(500, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Object rowData[][] = {
            {"101","Sawarin","Denamani"},
            {"102","John","Doe"},
            {"103","Jenny","Doe"},
        };
        
        String columnName[] = {"รหัส","ชื่อ","นามสกุล"};
        JTable tblData = new JTable(rowData, columnName);
        JScrollPane scp = new JScrollPane(tblData);
        frm.add(scp);
        frm.setVisible(true);//show
    }
}//end
