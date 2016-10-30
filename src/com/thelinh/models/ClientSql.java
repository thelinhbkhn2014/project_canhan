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
public class ClientSql {
    public static PreparedStatement ps;
    public  static ResultSet rs;
    
    public static Client signIn(String clientId, String clientPassword){
        Client cl = null;
        String sql = "SELECT * FROM Client WHERE ClientId = ? AND ClientPassword = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, clientId);
            ps.setString(2, clientPassword);
            rs = ps.executeQuery();
            while(rs.next()){
                cl = new Client(clientId, clientPassword, rs.getString("FullName"), rs.getDate("BirthDay"), rs.getString("Address"), rs.getString("Phone"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return cl;
    }
    
    public static void insertClient(Client cl){
        String sql = "INSERT INTO Client VALUES(?,?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, cl.getClientId());
            ps.setString(2, cl.getClientPassword());
            ps.setString(3, cl.getFullName());
            ps.setDate(4, cl.getBirthDay());
            ps.setString(5, cl.getAddress());
            ps.setString(6, cl.getPhone());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Add Successful", "Notification", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Unsuccessful", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        }
    }
    
    public static boolean updateClient(Client cl){
        String sql = "UPDATE Client SET ClientPassword = ?, FullName = ?, BirthDay = ?, Address = ?, Phone = ? WHERE ClientId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, cl.getClientPassword());
            ps.setString(2, cl.getFullName());
            ps.setDate(3, cl.getBirthDay());
            ps.setString(4, cl.getAddress());
            ps.setString(5, cl.getPhone());
            ps.setString(6, cl.getClientId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    public static boolean deleteClient(String clientId){
        String sql = "DELETE FROM Client WHERE ClientId = ?";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, clientId);
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

