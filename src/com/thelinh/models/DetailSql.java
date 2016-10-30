/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DetailSql {
  /*  ps.setString(3, co.getBookId());
            ps.setDate(4, co.getBorrowingDay());
            ps.setDate(5, co.getPayDay());
            ps.setDate(6, co.getDeadLine());
            ps.setInt(7, co.getDeposit());
            ps.setInt(8, co.getAmercement());*/
    
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static void insertDetail(Detail co){
        String sql = "INSERT INTO Detail VALUES(?,?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, co.getCheckOutId());
            ps.setString(2, co.getBookId());
            ps.setDate(3, co.getBorrowingDay());
            ps.setDate(4, co.getPayDay());
            ps.setInt(5, co.getDeposit());
            ps.setDate(6, co.getDeadLine());
            ps.setInt(7, co.getAmercement());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add Successful", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Unsuccessful", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        }
        
    }
    
    public static boolean updateDetail(Detail co){
        String sql = "UPDATE Detail SET BookId = ?, BorrowingDay = ?, PayDay = ?, Deposit = ?, DeadLine = ?, Amercement = ? WHERE CheckOutId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, co.getBookId());
            ps.setDate(2, co.getBorrowingDay());
            ps.setDate(3, co.getPayDay());
            ps.setInt(4, co.getDeposit());
            ps.setDate(5, co.getDeadLine());
            ps.setInt(6, co.getAmercement());
            ps.setString(7, co.getCheckOutId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
            return false;
            
        }
        
    }
    
    public static boolean deleteDetail(String checkOutId,String bookId){
        String sql = "DELETE FROM Detail WHERE CheckOutId = ? AND BookId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, checkOutId);
            ps.setString(2, bookId);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public ResultSet display(String sql){
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();  
        } catch (Exception e) {
            return null;
        }
        
    }
}
