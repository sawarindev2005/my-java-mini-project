package miniproject;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MySQLDB {

    Connection con;
    Statement stmt;
    ResultSet rs;

    public Connection connect() {
        String url = "jdbc:mysql://localhost/miniproject_db";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get a connection");
            System.out.println("ERROR : " + e);
            return null;
        }
    }

//    public static Connection getConnection() {
//        try {
//            Connection conn = DriverManager.getConnection(URL, USER, PASS);
//            return conn;
//        } catch (Exception e) {
//            System.out.println("Connection failed: " + e.getMessage());
//            return null;
//        }
//    }
    public int stmtCreInsUpdDel(String sql) {
        int row = 0;
        try {
            con = connect();
            stmt = con.createStatement();
            row = stmt.executeUpdate(sql);
            return row;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot execute query");
            System.out.println("ERROR : " + e);
            return row;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ArrayList<StudentInfo> selectAllStudents(String sql) {
        StudentInfo std;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            ArrayList<StudentInfo> list = new ArrayList<>();
            while (rs.next()) {
                std = new StudentInfo();
                std.setId(rs.getInt(1));             // column 1 = id (ไม่แสดง)
                std.setStudentId(rs.getString(2));   // column 2 = student_id
                std.setStudentName(rs.getString(3));
                std.setStudentSurname(rs.getString(4));
                std.setMidterm(rs.getDouble(5));
                std.setFinalScore(rs.getDouble(6));
                std.setTotal(rs.getDouble(7));
                std.setGrade(rs.getString(8));
                list.add(std);
            }
            return list;
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return null;
        }
    }

    public ResultSet selectQueryData(String sql) {
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get Data");
            System.out.println("ERROR : " + e);
            return null;
        } finally {
            // เพิ่ม finally ปิด connection ทุกครั้ง
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }
    
    //Sale Commission
    
    public ArrayList<SaleInfo> selectAllSales(String sql) {
    SaleInfo sale;
    try {
        con = connect();
        stmt = con.createStatement();
        rs = stmt.executeQuery(sql);
        ArrayList<SaleInfo> list = new ArrayList<>();
        while (rs.next()) {
            sale = new SaleInfo();
            sale.setSaleId(rs.getString(2));
            sale.setName(rs.getString(3));
            sale.setSurname(rs.getString(4));
            sale.setSaleClass(rs.getString(5));
            sale.setSaleTotal(rs.getDouble(6));
            sale.setRate(rs.getDouble(7));
            list.add(sale);
        }
        return list;
    } catch (Exception e) {
        System.out.println("ERROR: " + e);
        return null;
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (Exception e) {}
    }
}

    public static void main(String[] args) {

        MySQLDB db = new MySQLDB();
        Connection con = db.connect();
        System.out.println("con = " + con);
        
    }
}//end class
