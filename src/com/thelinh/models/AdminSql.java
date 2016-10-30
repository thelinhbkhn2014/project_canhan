/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AdminSql {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Admin signIn(String Id, String Password){
        Admin ad = null;
        String sql = "SELECT * FROM Admin WHERE Id = ? AND Password = ?";
        
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, Id);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            while(rs.next()){
                ad = new Admin(Id, Password);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        
        return ad;
    }
    
/*    public boolean DeleteAdmin(String Id){
        String sql = "DELETE FROM Admin WHERE Id = ?";
        
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, Id);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean UpdateAdmin(Admin ad){
        String sql = "UPDATE Admin SET Password = ? WHERE Id = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, ad.getPassword());
            ps.setString(2, ad.getId());
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
/*    public void InsertAdmin(Admin ad){
        String sql = "INSERT INTO Admin VALUES(?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, ad.getId());
            ps.setString(2, ad.getPassword());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Add Successful", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Unsuccessful", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
     */ 
    public ResultSet Display(String sql){
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();  
        } catch (Exception e) {
            return null;
        }
        
    }
    
}
