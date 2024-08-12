/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumexpress.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DBConnection {
    private static Connection conn;
    static{
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//AnushkaGarge:1521/xe","yumxpress","foodie");
            JOptionPane.showMessageDialog(null,"connection opened");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"cannot open the connection");
            ex.printStackTrace();
            System.exit(0);
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"can not close the coonection");
            ex.printStackTrace();
        }
    }
    
}
