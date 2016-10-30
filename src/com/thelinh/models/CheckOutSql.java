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
public class CheckOutSql {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static void insertCheckOut(CheckOut co){
        String sql = "INSERT INTO CheckOut VALUES(?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, co.getCheckOutId());
            ps.setString(2, co.getClientId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add Successful", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Unsuccessful", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        }
        
    }
    
    public static boolean updateCheckOut(CheckOut co){
        String sql = "UPDATE CheckOut SET ClientId = ? WHERE CheckOutId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, co.getClientId());
            ps.setString(2, co.getCheckOutId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static boolean deleteCheckOut(String checkOutId){
        String sql = "DELETE FROM CheckOut WHERE CheckOutId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, checkOutId);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static ResultSet display(String sql){
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();  
        } catch (Exception e) {
            return null;
        }
        
    }
    
}
