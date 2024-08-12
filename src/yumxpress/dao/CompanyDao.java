/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.dao;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import yumexpress.dbutil.DBConnection;
import yumexpress.pojo.CompanyPojo;
import yumexpress.pojo.ProductPojo;

/**
 *
 * @author hp
 */
public class CompanyDao {
    public static String getNewId()throws SQLException{
       Connection conn = DBConnection.getConnection();
       Statement st = conn.createStatement();
       ResultSet rs = st.executeQuery("Select max(company_id) from companies");
       rs.next();
       String id=rs.getString(1);
       String compId="";
       if(id!=null){
           id=id.substring(4);
           compId = "CMP-"+(Integer.parseInt(id)+1);
       }
       else{
           compId = "CMP-101";
       }
       return compId;
    }
    public static boolean addSeller(CompanyPojo comp)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into companies values(?,?,?,?,?,?,?)");
        //get data from pojo set into table
        ps.setString(1, getNewId());
        ps.setString(2, comp.getCompanyName());
        ps.setString(3, comp.getOwnerName());
        ps.setString(4, comp.getPassword());
        ps.setString(5, "ACTIVE");
        ps.setString(6, comp.getEmailId());
        ps.setString(7, comp.getSecurityKey());
        
        return ps.executeUpdate()==1;
    }
    public static CompanyPojo validate(String compName, String password)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from companies where company_name=? and password=? and status='ACTIVE'");
        ps.setString(1, compName);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        CompanyPojo comp = null;
        if(rs.next()){
           comp=new CompanyPojo();           
           comp.setCompanyId(rs.getString(1));
           comp.setOwnerName(rs.getString(3));           
           comp.setCompanyName(rs.getString(2));
        }       
        return comp; 
    }
    
    public static Map<String,String> getEmailCredentialsByCompanyId(String companyId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select email_id,security_key from companies where company_id=? and status='ACTIVE'");
        ps.setString(1, companyId);
        Map<String,String> companyCredentials=new HashMap<>();
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            String emailId=rs.getString(1);
            String secKey=rs.getString(2);
            companyCredentials.put("emailId", emailId);
            companyCredentials.put("securityKey", secKey);
            System.out.println(emailId+", "+secKey);
        }
        return companyCredentials;
    }
    
    public static Map<String,String> getAllCompanyIdAndName()throws SQLException { 
       Connection conn=DBConnection.getConnection(); 
       PreparedStatement ps=conn.prepareStatement("select company_id,company_name from companies where status='ACTIVE' and company_id in (select company_id from products)"); 
       ResultSet rs=ps.executeQuery(); 
       Map<String,String> compList=new HashMap<>(); 
       while(rs.next()){ 
           String c_id=rs.getString(1); 
           String c_name=rs.getString(2); 
           compList.put(c_name,c_id); 
            
       } 
       return compList; 
    }
    

}
