/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thelinh.controller;

import com.thelinh.models.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class LoadTable {
   // private static Connection con = Connect.getConnect();
   
 /*   public void LoadDataAdmin(String sql,JTable table){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Connect.getConnect();
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numberColumn = metaData.getColumnCount();
            
            ArrayList arrayColumn = new ArrayList();
            
            for(int i = 1; i <= numberColumn; i++){
                arrayColumn.add(metaData.getColumnName(i));
            }
            
            tableModel.setColumnIdentifiers(arrayColumn.toArray());
            
            ArrayList arrayRow = new ArrayList();
            while(rs.next()){                
                arrayRow.add(rs.getString(1));
                arrayRow.add(rs.getString(2));
                tableModel.addRow(arrayRow.toArray());
                arrayRow.clear();
            }
            table.setModel(tableModel);
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR", "Notification", JOptionPane.ERROR_MESSAGE);
        }
    } */
    
    public static void LoadDataBook(String sql,JTable table){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Connect.getConnect();
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numberColumn = metaData.getColumnCount();
            
            ArrayList arrayColumn = new ArrayList();
            
            for(int i = 1; i <= numberColumn; i++){
                arrayColumn.add(metaData.getColumnName(i));
            }
            
            tableModel.setColumnIdentifiers(arrayColumn.toArray());
            
            ArrayList arrayRow = new ArrayList();
            while(rs.next()){                
                arrayRow.add(rs.getString("BookId"));
                arrayRow.add(rs.getString("BookName"));
                arrayRow.add(rs.getString("AuthorName"));
                arrayRow.add(rs.getString("PublishingCompany"));
                arrayRow.add(rs.getString("Category"));
                arrayRow.add(rs.getInt("Price"));
                tableModel.addRow(arrayRow.toArray());
                arrayRow.clear();
            }
            table.setModel(tableModel);
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR", "Notification", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void LoadDataClient(String sql,JTable table){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Connect.getConnect();
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numberColumn = metaData.getColumnCount();
            
            ArrayList arrayColumn = new ArrayList();
            
            for(int i = 1; i <= numberColumn; i++){
                arrayColumn.add(metaData.getColumnName(i));
            }
            
            tableModel.setColumnIdentifiers(arrayColumn.toArray());
            
            ArrayList arrayRow = new ArrayList();
            while(rs.next()){                
                arrayRow.add(rs.getString("ClientId"));
                arrayRow.add(rs.getString("ClientPassword"));
                arrayRow.add(rs.getString("FullName"));
                arrayRow.add(rs.getDate("BirthDay"));
                arrayRow.add(rs.getString("Address"));
                arrayRow.add(rs.getString("Phone"));
                tableModel.addRow(arrayRow.toArray());
                arrayRow.clear();
            }
            table.setModel(tableModel);
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR", "Notification", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public static void LoadDataCheckOut(String sql,JTable table){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Connect.getConnect();
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numberColumn = metaData.getColumnCount();
            
            ArrayList arrayColumn = new ArrayList();
            
            for(int i = 1; i <= numberColumn; i++){
                arrayColumn.add(metaData.getColumnName(i));
            }
            
            tableModel.setColumnIdentifiers(arrayColumn.toArray());
            
            ArrayList arrayRow = new ArrayList();
            while(rs.next()){                
                arrayRow.add(rs.getString("CheckOutId"));
                arrayRow.add(rs.getString("ClientId"));
                arrayRow.add(rs.getString("BookId"));
                arrayRow.add(rs.getDate("BorrowingDay"));
                arrayRow.add(rs.getDate("PayDay"));
                arrayRow.add(rs.getDate("DeadLine"));
                arrayRow.add(rs.getInt("Deposit"));
                arrayRow.add(rs.getInt("Amercement"));
                tableModel.addRow(arrayRow.toArray());
                arrayRow.clear();
            }
            table.setModel(tableModel);
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR", "Notification", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        }
    }
    
    public static void loadDataCheckOut(String sql,JTable table){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Connect.getConnect();
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numberColumn = metaData.getColumnCount();
            
            ArrayList arrayColumn = new ArrayList();
            
            for(int i = 1; i <= numberColumn; i++){
                arrayColumn.add(metaData.getColumnName(i));
            }
            
            tableModel.setColumnIdentifiers(arrayColumn.toArray());
            
            ArrayList arrayRow = new ArrayList();
            while(rs.next()){                
                arrayRow.add(rs.getString("CheckOutId"));
                arrayRow.add(rs.getString("ClientId"));
                tableModel.addRow(arrayRow.toArray());
                arrayRow.clear();
            }
            table.setModel(tableModel);
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR", "Notification", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        }
    }
    
    public static ResultSet Display(String sql){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Connect.getConnect();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); 
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
